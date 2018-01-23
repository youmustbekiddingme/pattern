package com.caolh.designPattern._8template.impl;

import com.caolh.designPattern._8template.CaffeineBeverage;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/10
 */
public class Tea  extends CaffeineBeverage {
    @Override
    public void brew() {
        //浸泡茶
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        //加入柠檬
        System.out.println("Adding Lemon");
    }
}
