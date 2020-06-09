package com.example.demo.arithmetic.heap;

import com.example.demo.arithmetic.array.Array;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/6/9 8:49 AM
 *
 *
 * parent(i) = i / 2;
 * left child (i) = 2 * i;
 * right child(i) = 2 * i + 1;
 */

public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capacity){
        data = new Array<>(capacity);
    }

    public MaxHeap(){
        data = new Array<>();
    }

    private int parent(int index){
        if (index == 0){
            throw new IllegalArgumentException("index-0 doesn't have parent");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index){
        return (index - 1) * 2 + 1;
    }

    private int rightChild(int index){
        return (index - 1) * 2 + 2;
    }
}
