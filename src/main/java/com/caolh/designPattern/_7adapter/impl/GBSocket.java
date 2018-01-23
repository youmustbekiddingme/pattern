package com.caolh.designPattern._7adapter.impl;

import com.caolh.designPattern._7adapter.GBSocketInterface;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/17
 * 中国插座
 */
public class GBSocket implements GBSocketInterface {
    public void powerWithThreeFlat() {
        System.out.println("使用三项扁头插孔供电");
    }
}
