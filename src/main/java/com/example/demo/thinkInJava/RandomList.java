package com.example.demo.thinkInJava;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: tbq
 * @DateTime: 2020/11/24 8:58 PM
 * @Description: 一个持有特定类型对象列表
 */
public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<T>();

    private Random random = new Random(50);

    public void add(T item){

        storage.add(item);
    }

    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String>  rs = new RandomList<>();
        for (String s : "this is a tearcher dog".split(" ")){
            rs.add(s);
        }

        for (int i = 0; i < 8; i ++){
            System.out.println(rs.select()+ "");

        }
    }


}
