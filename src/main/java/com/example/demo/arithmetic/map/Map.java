package com.example.demo.arithmetic.map;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/6/1 8:52 AM
 */

public interface Map<K, V> {
    void add(K key, V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void set(K key, V value);
    int getSize();
    boolean  isEmpty();

}
