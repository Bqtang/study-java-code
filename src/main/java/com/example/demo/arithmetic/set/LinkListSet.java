package com.example.demo.arithmetic.set;

import com.example.demo.arithmetic.linklist.LinkList;

public class LinkListSet <E extends Comparable<E>> implements  Set<E> {


    private LinkList  linkList;

    @Override
    public void add(E e) {
        if (!containts(e)){
            linkList.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean containts(E e) {
        return  linkList.contains(e);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
