package com.example.demo.arithmetic.set;

import com.example.demo.arithmetic.tree.BSTtree;

public class BSTSet<E extends Comparable<E>>  implements Set<E> {

    private BSTtree<E>  bsTtree;

    public BSTSet(){
        bsTtree= new BSTtree<>();
    }

    @Override
    public void add(E e) {
        bsTtree.add(e);
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean containts(E e) {
        return true;
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
