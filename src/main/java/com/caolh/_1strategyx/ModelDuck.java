package com.caolh._1strategyx;


import com.caolh._1strategyx.impl.FlyNoWay;
import com.caolh._1strategyx.impl.Quack;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 * 模型Duck
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior= new Quack();
    }


    public void display() {
        System.out.println("i'am a model duck");
    }
}
