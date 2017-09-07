package com.caolh._1strategy;

import com.caolh._1strategy.impl.FlyWithWings;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 * 策略设计模式
 * 优先级：has a方式-->implements-->继承
 */
public class App {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        //动态改变飞行行为
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
