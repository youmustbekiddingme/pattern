package com.caolh.designPattern._3decorate.impl;

import com.caolh.designPattern._3decorate.Condiment;
import com.caolh.designPattern._3decorate.Humburger;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 */
//蔬菜调料
public class Lettuce extends Condiment { //调料

    Humburger humburger;

    public Lettuce(Humburger humburger){
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+" 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice()+1.5;
    }

}