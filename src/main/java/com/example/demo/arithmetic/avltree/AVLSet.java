package com.example.demo.arithmetic.avltree;

import com.example.demo.arithmetic.set.Set;

/**
 * @Description: AVL 性能更好。 性能OLog(N);
 * @Auther: tangbingqun
 * @Date: 2020/6/27 9:45 AM
 */

public class AVLSet<E extends Comparable<E>> implements Set<E> {

    private AVLTree<E, Object> avl;

    public AVLSet() {
        avl = new AVLTree<>();
    }


    @Override
    public void add(E e) {
        avl.add(e, null);
    }

    @Override
    public void remove(E e) {
        avl.remove(e);
    }

    @Override
    public boolean containts(E e) {
        return avl.contains(e);
    }

    @Override
    public int getSize() {
        return avl.getSize();
    }


    @Override
    public boolean isEmpty() {
        return avl.isEmpty();
    }

}

