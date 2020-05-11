package com.example.demo.arithmetic.stack;

/**
 * @Description: 栈是一种后进先出的数据结构。
 * @Auther: tangbingqun
 * @Date: 2020/4/30 4:55 PM
 */

public interface Stack<E> {
    int getSize();
    boolean  isEmpty();
    void push(E e);
    E pop();
    E peek();

}
