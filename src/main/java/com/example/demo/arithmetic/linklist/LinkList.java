package com.example.demo.arithmetic.linklist;


/**
 * @Description: 链表 ---> 真正的动态数据结构。  (包含虚拟头节点)
 * @Auther: tangbingqun
 * @Date: 2020/4/28 3:46 PM
 */
public class LinkList<E> {
    //单向链表的结构
    private class Node {
        private E e;
        private Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }
    }

    private Node dummyHead;

    private int size;

    public LinkList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("all failed");
        }
        //遍历列表
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = new Node(e, prev.next);
        size++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("all failed");
        }
        Node prev = dummyHead.next;
        for(int  i  = 0 ; i  < index; i++){
            prev = prev.next;
        }
        return  prev.e;
    }

    public void set (int index, E e){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("all failed");
        }
        Node cur = dummyHead.next;
        for(int i =0; i < index; i ++){
            cur = cur.next;
        }
        cur.e = e;
    }

    public Boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if (cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

}
