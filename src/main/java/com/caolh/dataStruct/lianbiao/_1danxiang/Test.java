package com.caolh.dataStruct.lianbiao._1danxiang;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/5/5 0005.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));
        int no;
        String name;
        int score;

        System.out.println("请输入5个学生信息");
        MyLinkedList myLinkedList = new MyLinkedList();
        for(int i=1;i<6;i++){
            System.out.println("请输入学号");
            no=Integer.parseInt(buf.readLine());
            System.out.println("请输入名字");
            name=buf.readLine();
            System.out.println("请输入分数");
            score=Integer.parseInt(buf.readLine());
            myLinkedList.insert(no,name,score);
            System.out.println("--------------------------");
        }
        System.out.println("所有学生信息");
        myLinkedList.print();;

    }
}
