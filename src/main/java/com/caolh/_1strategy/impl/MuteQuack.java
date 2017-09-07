package com.caolh._1strategy.impl;


import com.caolh._1strategy.QuackBehavior;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("slience 不会叫");
    }
}
