package com.example.demo.arithmetic.hightLevel.heap;


import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 大顶堆
 * @author: tangbingqun
 * @Date: 2021/3/29 6:56 下午
 */
public class MaxHeap<E extends Comparable<E>> {
    private ArrayList<E> data;

    public MaxHeap(int capacity) {
        this.data = new ArrayList<E>();
    }

    public MaxHeap() {
        this.data = new ArrayList<E>();
    }

    public MaxHeap(E[] arr){
        List<E> es = Arrays.asList(arr);


    }


    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index-0 does not have parent");
        }
        return (index - 1) / 2;
    }

    public Integer getSize() {
        return data.size();
    }

    public Boolean isEmpty() {
        return data.size() == 0;
    }


    /**
     * 往大顶堆中添加元素
     */
    public void add(E e) {
        data.add(e);
        sifUp(data.size() - 1);
    }

    ;


    public void sifUp(int index) {
        E e = data.get(index);
        //循环比较并上浮， 一直到节点是跟节点。
        while (index > 0) {
            E parentNode = data.get(parent(index));
            if (e.compareTo(parentNode) <= 0) {
                break;
            }
            data.set(index, parentNode);
            index = parent(index);
        }
        data.set(index, e);
    }


    /**
     * 从顶堆中取出并删除最大值
     */
    public E removeMaxHeap() {
        E max = findMax();
        E last = data.get(data.size() - 1);
        data.set(0, last);

        data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            siftDown(0);
        }
        return max;
    }

    public void siftDown(int index) {
        E e = data.get(index);
        while (leftChild(index) < data.size()) {
            int maxNodeIndex = leftChild(index);
            if (rightChild(index) < data.size()) {
                if (data.get(rightChild(index)).compareTo(data.get(leftChild(index))) > 0) {
                    maxNodeIndex = rightChild(index);
                }
            }
            if (data.get(index).compareTo(data.get(maxNodeIndex)) >= 0) {
                break;
            }
            data.set(index, data.get(maxNodeIndex));
        }
        data.set(index, e);
    }


    /**
     * 获取堆顶的值
     *
     * @return
     */
    public E findMax() {
        if (data.size() == 0) {
            throw new RuntimeException("Heap is Empty");
        }
        return data.get(0);
    }


}
