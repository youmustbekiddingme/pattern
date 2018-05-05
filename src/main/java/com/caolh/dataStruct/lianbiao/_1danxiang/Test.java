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
        Node head = new Node(0,"caolihua",99);
        Node node1 = new Node(1,"xingfei",88);
        Node node2 = new Node(2,"wumeng",98);
        Node node3 = new Node(3,"zhangsan",88);
        Node node4 = new Node(4,"lisi",99);

        System.out.println("请输入5个学生信息");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(head);myLinkedList.insert(node1);myLinkedList.insert(node2);myLinkedList.insert(node3);myLinkedList.insert(node4);

        System.out.println("所有学生信息");
        myLinkedList.print();;
        //删除一个
        System.out.println("删除一个node");
        myLinkedList.delete(2);
        myLinkedList.print();;

        //测试反转
        System.out.println("测试反转");
        myLinkedList.reverse(head);
        myLinkedList.print();
    }
}
