package com.caolh.designPattern._2observer;

import com.caolh.designPattern._2observer.impl.CurrentConditionDisplay;
import com.caolh.designPattern._2observer.impl.ForecastDisplay;
import com.caolh.designPattern._2observer.impl.WeatherData;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 *
 * 一对多的，有关联关系的对象之间，数据传递。解耦。
 * 类似于消息队列的广播模式
 */
public class App {
    //观察者设计模式
    public static void main(String[] args) {
        WeatherData weatherData =  new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //主题一旦改变，所有的订阅者都统一跟着改变
        weatherData.setMeasurements(80,65,30.4f);
    }
}
