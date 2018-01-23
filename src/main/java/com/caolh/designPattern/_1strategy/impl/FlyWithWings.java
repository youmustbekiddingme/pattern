package com.caolh.designPattern._1strategy.impl;


import com.caolh.designPattern._1strategy.FlyBehavior;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("i'am flying");
    }
}
