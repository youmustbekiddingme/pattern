package com.caolh.designPattern._2observer.impl;

import com.caolh.designPattern._2observer.Observer;
import com.caolh.designPattern._2observer.Subject;

import java.util.ArrayList;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 将所有观察者保存到list集合里
      */
    public WeatherData(){
        observers = new ArrayList();
    }

    /**
     * 注册观察者到主题里
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    /**
     * 这里是主题变了，将会调用观察者的方法，让他们各自去执行
     *  这里是将所有的数据都推送给了订阅者
     */
    public void notifyObservers() {
        for(int i =0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    //测量值一旦改变，启动向观察者发送数据的方法
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
