package com.caolh.designPattern._7adapter;

import com.caolh.designPattern._7adapter.impl.GBSocket;
import com.caolh.designPattern._7adapter.impl.SocketAdapter;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/10
 */
public class App {
    //适配器设计模式
    /**
     * 我们国家的电器使用普通的扁平两项或三项插头，而去外国的话，使用的标准就不一样了，
     * 比如德国，使用的是德国标准，是两项圆头的插头。如果去德国旅游，那么我们使用的手机充电器插头无法插到德国的插排中去
     * ，那就意味着我们无法给手机充电。怎样解决这个问题呢？只要使用一个电源转化器就行了。
     * @param args
     */
    public static void main(String[] args) {
        GBSocketInterface gbSocket = new GBSocket();

        Hotel hotel = new Hotel();

        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        hotel.setSocket(socketAdapter);

        hotel.charge();
    }
}
