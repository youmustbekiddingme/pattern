package com.caolh._8template;

/**
 * Create with IntelliJ IDEA
 * User:曹立华
 * Date:2017/9/10
 * 咖啡因抽象类，泡茶和泡咖啡都含有咖啡因
 */
public abstract class CaffeineBeverage {
    //定义为final，不希望子类修改
    //准备食谱,将算法封装成为一个模板,4个步骤
    final void prepareRecipe(){
        //泡茶和泡咖啡一样
        boilWater();
        brew();
        //泡茶和泡咖啡一样
        pourInCup();
        addCondiments();
    }

    /**
     * 烧水
     */
    //定义为公开的类，其他包的类才以访问这个方法可
   public  void boilWater(){
        System.out.println("Boiling water");
    }
    /**
     *  倒入杯子中
     */
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * 冲泡
     */
    public abstract void brew();

    /**
     * 添加调料
     */
    public abstract void addCondiments();
}
