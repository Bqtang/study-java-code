package com.example.demo.arithmetic.queue;

/**
 * @Description: 循环队列
 * @Auther: tangbingqun
 * @Date: 2020/5/13 8:47 AM
 */

public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front,tail;
    private int size;


    public LoopQueue(int capacity){
        //data = (E) new Object[capacity + 1];

    }

    @Override
    public int getSize() {
        return 0;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }



    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue(E e) {
        return null;
    }


    @Override
    public E getFront() {
        return null;
    }

}
