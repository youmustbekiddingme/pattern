package com.caolh.dataStruct.lianbiao._1danxiang;

/**
 * Created by Administrator on 2018/5/5 0005.
 */
public class Node {
    //该节点包含一个对象，该对象有3个字段；还包含一个指向下一个节点的指针
    int no;
    String name;
    int score;
    Node next;

    /**
     * 定义的节点的next 指针为空
     * @param no
     * @param name
     * @param score
     */
    public Node(int no, String name, int score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

}
