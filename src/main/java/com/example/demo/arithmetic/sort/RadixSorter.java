package com.example.demo.arithmetic.sort;

import java.util.Arrays;

/**
 * @Author: tbq  基数排序(基于计数排序算法)
 * @DateTime: 2021/1/12 9:44 PM
 * @Description:
 *
 * 1233, 2124, 6723, 9832, 2864
 *
 */
public class RadixSorter {

    public void sort(int[] data){
        if (data == null || data.length <= 1){
            return;
        }
        int maxNum = data[0];
        for (int i = 1; i < data.length - 1; i ++){
            maxNum = Math.max(maxNum, data[i]);
        }

        //个位数 （234 / 1）% 10 = 4
        //十位数 （234 / 10）% 10 = 3
        //百位数 （234 / 100）% 10 = 2

        for (int exp = 1; maxNum / exp > 0; exp *= 10){
            countSort(data, 1);
        }

    }

    public static void main(String[] args) {
        int[]  data = new int[]{1234,7483,2910,3811,9722,3444555};
        new RadixSorter().sort(data);
        System.out.println(Arrays.toString(data));

    }

    public void countSort(int[] data, int exp){

        int[] count = new int[10];

        //计数
        for (int i = 0; i < data.length; i ++){
            int digit = (data[i] / exp) % 10;
            count[digit] ++;
        }

        //累加
        for (int i= 1; i < 10 ; i++){
            count[i] += count[i - 1];
        }

        int[] output = new int[data.length];
        for (int i = data.length - 1; i > 0; i --){
            int digit = (data[i] / exp) % 10;
            int k = count[digit] - 1;
            output[k] = data[i];
            count[digit] --;

        }

        for (int i = 0; i < data.length; i++){
            data[i] = output[i];
        }

    }

}
