package com.caolh.designPattern._7adapter;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/17
 * 德国宾馆
 *
 */
public class Hotel {
    //旅馆中有一个德标的插口
    //该插口是不能变的，自己去德国旅游带的是中国的插口
    private DBSocketInterface dbSocket;

    public Hotel(){}

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void setSocket (DBSocketInterface dbSocket){
        this.dbSocket = dbSocket;
    }

    //旅馆中有一个充电的功能
    public void charge(){

        //使用德标插口充电
        dbSocket.powerWithTwoRound();
    }
}
