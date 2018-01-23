package com.caolh.designPattern._2observer;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 * 订阅者 ：接口
 */
public interface Observer {
    //观察者里的，所有观察者都具有这个方法
    public void update(float temp, float humidity, float pressure);
}
