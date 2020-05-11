package com.example.demo.arithmetic.linklist;

/**
 * @Description:  单向链表的实现(节点)
 * @Auther: tangbingqun
 * @Date: 2020/4/28 3:46 PM
 */

public class Linked <T>{
    //单向链表的结构
    class Node{
        private T data;
        private Node  next;

        public Node (T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node  head;
    private int   size;

    public Linked(){
        this.head = null;
        this.size = 0;
    }



}
