package com.example.demo.arithmetic.stack;

import com.example.demo.arithmetic.array.Array;

/**
 * @Description: 通过数组实现栈结构
 * @Auther: tangbingqun
 * @Date: 2020/4/30 5:12 PM
 */

public class ArrayStack<E> implements Stack<E> {
    Array <E> array;

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();

    }

    @Override
    public void push(E e) {
        array.addLast(e);

    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }
}
