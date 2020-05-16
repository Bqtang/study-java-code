package com.example.demo.arithmetic.array;

/**
 * @Description: 数组结构
 * @Auther: tangbingqun
 * @Date: 2020/4/29 3:22 PM
 */
public class Array<E> {

    private E[] data;
    private int size;


    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    //插入元素
    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    //在任意数据上插入元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Require index >= 0 || index < size.");
        }
        //动态扩容
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            //将元素往后面移动
            data[i + 1] = data[i];
            data[index] = e;
            size++;
        }
    }
    //动态容器
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public E remove(int index) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed, Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Require index >= 0 || index < size.");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        //动态缩容
        if (size == data.length / 2 && data.length / 2 != 0 ){
            resize(data.length / 2);
        }
        return ret;
    }

    public E removeLast(){
        E last = data[size];
        data[size] = null;
        return last;
    }

    public E removeFirst(){
       E first =  data[0];
       data[0] = null;
       return first;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed");
        }
        return data[index];
    }

    public E getLast(){
        return get(size - 1);
    }

    public E getFirst(){
        return get(0);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed");
        }
        data[index] = e;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }


}
