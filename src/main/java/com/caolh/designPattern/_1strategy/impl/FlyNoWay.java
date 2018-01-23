package com.caolh.designPattern._1strategy.impl;


import com.caolh.designPattern._1strategy.FlyBehavior;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("i can't fly");
    }
}
