package com.example.demo.thinkInJava;

/**
 * @Author: tbq
 * @DateTime: 2020/11/24 8:44 PM
 * @Description: 堆栈类
 */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            this.item = null;
            this.next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;

        }

        boolean end() {
            return item == null && next == null;
        }

    }

    private Node<T> top = new Node<T>();

    //向头部加元素
    public void push(T item) {
        top = new Node<>(item, top);
    }


    //向头部获取元素
    public T pop() {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;

    }


    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "person on is java!".split("")){
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null){
            System.out.println(s);
        }
    }


}
