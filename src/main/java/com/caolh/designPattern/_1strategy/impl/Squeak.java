package com.caolh.designPattern._1strategy.impl;

import com.caolh.designPattern._1strategy.QuackBehavior;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak 吱吱叫");
    }
}
