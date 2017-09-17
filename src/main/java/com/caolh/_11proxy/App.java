package com.caolh._11proxy;

import com.caolh._11proxy.impl.WangPo;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/17
 */
public class App {
    //代理设计模式
    //王婆给西门庆介绍潘金莲，王婆做代理和西门庆羞羞，其实是潘金莲和西门庆羞羞
    public static void main(String[] args) {
        //OK,这里西门庆开始测试了
        WangPo wangPo = new WangPo();
        wangPo.kissMan();
        wangPo.makeLoveWithMan();
    }
}
