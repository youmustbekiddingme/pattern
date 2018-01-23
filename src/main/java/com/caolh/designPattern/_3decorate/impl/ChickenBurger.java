package com.caolh.designPattern._3decorate.impl;

import com.caolh.designPattern._3decorate.Humburger;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
public class ChickenBurger extends Humburger {

    public ChickenBurger(){
        name = "鸡腿堡";
    }

    public double getPrice() {
        return 10;
    }

}
