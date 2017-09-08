package com.caolh._1strategy;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/7
 */
public abstract class Duck {
    //不同鸭子的飞和叫的方式不一样，以组合 ：has a 的方式，不用implement的方式,将变换的部分提取出来，用类维护。
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }

    public abstract void display();

    //动态运行改变飞行行为
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior=flyBehavior;
    }
    //动态运行程序改变叫的行为
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior=quackBehavior;
    }
    //委托duck 运行飞行 行为
    public void performFly(){
        flyBehavior.fly();
    }
    //委托duck 运行叫 行为
    public void performQuack(){
        quackBehavior.quack();
    }

    //所有鸭子都会继承swim方法，可以确定所有鸭子都游泳
    public void swim(){
        System.out.println("all duck swim");
    }

}
