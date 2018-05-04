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
     * 节点的删除,根据节点编号删除
     * @param no
     */
    public void delete(int no){
        Node newNode;
        Node tmp;
        //1. 删除第一个节点:
        // 将第一个节点的指针指向第二个节点的指针
        if(first.no==no){
            first=first.next;
         //2.删除最后一个节点
        //将倒数第二个节点的指针设置为last
        }else if(last.no==no){
            newNode =first;
            while(newNode.next!=last) newNode=newNode.next; //循环判断，找到最后一个节点的前一个节点
            newNode.next=last.next;
            last=newNode;
            //3.删除中间的节点
        }else{
            newNode=first;
            tmp=first;
            //循环，找到临界不 相等的那个newNode
            while(newNode.no!=no){
                tmp=newNode;
                newNode=newNode.next; //第一次next
            }
            //第二次next
            tmp.next=newNode.next;
        }
    }

    /**
     * 遍历所有节点信息;需要从第一个节点往下找
     */
    public void print(){
        Node current =first;
        while(current!=null){
            System.out.println("["+current.no+"  "+current.name+"  "+current.score+"]");
            current=current.next;
        }
    }
}
