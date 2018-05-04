package com.caolh.dataStruct.lianbiao._1danxiang;

/**
 * Created by Administrator on 2018/5/5 0005.
 */
public class MyLinkedList {
    private Node first;
    private Node last;

    /**
     * 初次判断，first节点是否为空
     * @return
     */
    public boolean isEmpty(){
        return first==null;
    }

    /**
     * 新插入一个节点
     * @param no
     * @param name
     * @param score
     */
    public void insert(int no,String name,int score){
        Node newNode=new Node(no,name,score);//每次新插入的节点的next 节点都是null
        if(this.isEmpty()){
            first=newNode;
            last=newNode;
        }else{
            last.next=newNode;//将前一个节点的下一个节点，定义为新插入的节点
            last=newNode; //将最后一个节点定义为新插入的节点
        }
    }

    /**
     * 遍历所有节点信息
     */
    public void print(){
        Node current =first;
        while(current!=null){
            System.out.println("["+current.no+"  "+current.name+"  "+current.score+"]");
            current=current.next;
        }
    }
}
