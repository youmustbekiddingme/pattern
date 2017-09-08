package com.caolh._2observer.impl;

import com.caolh._2observer.DisplayElement;
import com.caolh._2observer.Observer;
import com.caolh._2observer.Subject;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 * 其中的一个订阅者,当前温湿度
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //将订阅者注册到主题中,主题一旦改变，所有的订阅者的update方法都会被调用，但是具体update的实现，每个订阅者又是不一样的
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    //订阅者会收到所有一样的数据，但是每个订阅者对数据处理的方式是不一样的。
    public void update(float temp, float humidity, float pressure) {
        this.temperature= temp;
        this.humidity = humidity;
        dispaly();
    }

    public void dispaly() {
        System.out.println("current conditions:"+temperature+":F degrees and "+humidity+"% humidity");
    }
}
