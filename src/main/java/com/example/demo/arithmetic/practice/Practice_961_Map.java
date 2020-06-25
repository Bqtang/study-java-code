package com.example.demo.arithmetic.practice;

import java.util.HashMap;

/**
 * @Author: tbq
 * @DateTime: 2020/6/25 9:03 PM
 * @Description:
 */
public class Practice_961_Map {

    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> count = new HashMap();
        for (int x : A){
            count.put(x, count.getOrDefault(x,0) + 1);
        }
        for (int k : count.keySet()){
            if (count.get(k) == (A.length / 2) ){
                return k;
            }
        }
        throw  null;
    }
}
