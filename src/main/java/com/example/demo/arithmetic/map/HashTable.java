package com.example.demo.arithmetic.map;

import java.util.TreeMap;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/7/4 8:56 AM
 */

public class HashTable <K, V> {

    private static final int upperTol = 10;
    private static final int lowerTol = 2;
    private static final int initCapacity = 7;

    //hash 冲突 用素数处理。



    private TreeMap<K, V> [] hashtable;
    private int M;
    private int size;

    public HashTable(int M){
        this.M = M;
        size = 0;
        hashtable = new TreeMap[M];
        for (int i = 0; i < M; i ++){
            hashtable[i] = new TreeMap<>();
        }
    }

    public HashTable(){
        this(initCapacity);
    }

    private int hash(K key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public int getSize(){
        return size;
    }

    public void add(K key, V value){
        TreeMap<K, V> map = hashtable[hash(key)];
        if (map.containsKey(key)){
            map.put(key, value);
        }else {
            map.put(key, value);
            size ++;
            if (size >= upperTol * M){
                resize(2 * M);
            }
        }
    }

    public V remove(K key){
        TreeMap<K, V>  map = hashtable[hash(key)];
        V ret = null;
        if (map.containsKey(key)){
            ret = map.remove(key);
            size --;
            if (size < lowerTol * M && M / 2 >=  initCapacity){
                resize(M / 2);
            }
        }
        return ret;
    }


   private void resize(int newM){
        TreeMap<K, V> []  newHashTable = new TreeMap[newM];



   }
}
