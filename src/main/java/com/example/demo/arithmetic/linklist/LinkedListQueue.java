package com.example.demo.arithmetic.linklist;


import com.example.demo.arithmetic.queue.Queue;

/**
 * @Description: 循环队列(利用链表进行实现)
 * @Auther: tangbingqun
 * @Date: 2020/5/16 9:18 AM
 */

public class LinkedListQueue<E> implements Queue<E> {


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
