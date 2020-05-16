package com.example.demo.arithmetic.linklist;

import com.example.demo.arithmetic.stack.Stack;

import java.util.LinkedList;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/5/15 9:09 AM
 */

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E>  list;

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
