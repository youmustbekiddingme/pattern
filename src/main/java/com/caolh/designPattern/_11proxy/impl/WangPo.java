package com.caolh.designPattern._11proxy.impl;

import com.caolh.designPattern._11proxy.BadWoman;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/17
 */
public class WangPo implements BadWoman {
    private BadWoman badWoman;
    //王婆默认给潘金莲做代理
    public WangPo(){
        this.badWoman = new PanJinlian();
    }
    //王婆还可以给其他人做代理
    public WangPo(BadWoman badWoman){
        this.badWoman = badWoman;
    }
    // 具体被代理的去做,王婆这个老女人已经做不动了
    public void kissMan() {
        this.badWoman.kissMan();
    }
    //具体被代理的去做,王婆这个老女人已经做不动了
    public void makeLoveWithMan() {
        this.badWoman.makeLoveWithMan();
    }
}
