package com.caolh._2observer;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/8
 * 主题 接口
 */
public interface Subject {
    //下面的三个方法是主题都要应该有的方法，具体实现类可以添加自己的新的方法。
     //注册观察者
    public void registerObserver(Observer o);
    //移除观察者
    public void removeObserver(Observer o );
    //主题改变时，该方法将被调用，通知所有观察者
    public void notifyObservers();
}
