package com.caolh.dataStruct.lianbiao._1danxiang;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/5/5 0005.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        int no;
        String name;
        int score;

        System.out.println("请输入5个学生信息");
        MyLinkedList myLinkedList = new MyLinkedList();
        for(int i=1;i<6;i++){
            no=i;
            name="caolihua"+i;
            score=i*10;
            myLinkedList.insert(no,name,score);
            System.out.println("--------------------------");
        }
        System.out.println("所有学生信息");
        myLinkedList.print();;
        //删除一个
        System.out.println("删除一个node");
        myLinkedList.delete(5);
        myLinkedList.print();;

    }
}
