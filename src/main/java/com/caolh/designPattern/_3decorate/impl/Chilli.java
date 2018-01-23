package com.caolh.designPattern._3decorate.impl;

import com.caolh.designPattern._3decorate.Condiment;
import com.caolh.designPattern._3decorate.Humburger;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
//辣椒调料
public class Chilli extends Condiment {

    Humburger humburger;

    public Chilli(Humburger humburger){
        this.humburger = humburger;

    }

    @Override
    public String getName() {
        return humburger.getName()+" 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();  //辣椒是免费的哦
    }

}

