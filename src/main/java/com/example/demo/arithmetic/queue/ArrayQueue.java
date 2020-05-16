package com.example.demo.arithmetic.queue;

import com.example.demo.arithmetic.array.Array;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/5/11 6:12 PM
 */

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;


    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
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

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue(E e) {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }
}
