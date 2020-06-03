package com.example.demo.arithmetic.linklist;

import com.example.demo.arithmetic.stack.Stack;

import java.util.LinkedList;

/**
 * @Description: 链表实现栈
 * @Auther: tangbingqun
 * @Date: 2020/5/15 9:09 AM
 */

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addLast(e);

    }

    @Override
    public E pop() {
        return list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
    }
}
