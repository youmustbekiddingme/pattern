package com.caolh.designPattern._8template.impl;

import com.caolh.designPattern._8template.CaffeineBeverage;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/10
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        //冲咖啡
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        //加入糖和奶
        System.out.println("Adding Sugar and Milk");
    }
}
