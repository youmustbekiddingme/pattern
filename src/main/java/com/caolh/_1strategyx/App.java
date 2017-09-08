package com.caolh._1strategyx;

import com.caolh._1strategyx.impl.FlyWithWings;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 *
 * 优先级：has a方式-->implements-->继承
 * 鸭子模型例子，将行为委托给鸭子的属性，而不是采用继承、实现接口的行为 的 方式
 */
public class App {
    public static void main(String[] args) {
        //策略设计模式   。。。
        Duck model = new ModelDuck();
        model.performFly();
        //动态改变飞行行为
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
