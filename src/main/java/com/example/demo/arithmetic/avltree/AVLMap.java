package com.example.demo.arithmetic.avltree;

import com.example.demo.arithmetic.map.Map;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/6/27 9:38 AM
 */

public class AVLMap<K extends Comparable<K> ,V>  implements Map<K,V> {

    private AVLTree<K, V>  avl;

    public AVLMap(){
        avl = new AVLTree<>();
    }

    @Override
    public void add(K key, V value) {
        avl.add(key,value);
    }


    @Override
    public V remove(K key) {
        return avl.remove(key);
    }


    @Override
    public boolean contains(K key) {
        return avl.contains(key);
    }


    @Override
    public V get(K key) {
        return avl.get(key);
    }


    @Override
    public void set(K key, V value){
        avl.set(key,value);

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
