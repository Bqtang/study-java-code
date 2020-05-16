package com.example.demo.arithmetic.queue;

/**
 * @Description: 队列
 * @Auther: tangbingqun  栈  队列  动态数组
 * @Date: 2020/5/11 6:07 PM
 */

public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue(E e);

    E getFront();

}
