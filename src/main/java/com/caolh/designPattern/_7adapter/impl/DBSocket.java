package com.caolh.designPattern._7adapter.impl;

import com.caolh.designPattern._7adapter.DBSocketInterface;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/17
 */
public class DBSocket implements DBSocketInterface {
    public void powerWithTwoRound() {
        System.out.println("使用两项圆头的插孔供电");
    }
}
