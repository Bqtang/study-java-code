package com.example.demo.arithmetic.set;

public interface Set<E> {

    void  add(E e);
    void  remove(E e);
    boolean containts(E e);
    int getSize();
    boolean isEmpty();

}
