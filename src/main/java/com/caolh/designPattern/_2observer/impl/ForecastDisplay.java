package com.caolh.designPattern._2observer.impl;

import com.caolh.designPattern._2observer.DisplayElement;
import com.caolh.designPattern._2observer.Observer;
import com.caolh.designPattern._2observer.Subject;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 * 其中的一个订阅者,天气预报
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float temperature;
    private float pressure;
    private Subject weatherData;

    //将订阅者注册到主题中,主题一旦改变，所有的订阅者的update方法都会被调用，但是具体update的实现，每个订阅者又是不一样的
    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    //订阅者会收到所有一样的数据，但是每个订阅者对数据处理的方式是不一样的。
    public void update(float temp, float humidity, float pressure) {
        this.temperature= temp;
        this.pressure = pressure;
        dispaly();
    }

    public void dispaly() {
        System.out.println("ForecastDisplay:"+temperature+":F degrees and "+pressure+"pk");
    }
}
