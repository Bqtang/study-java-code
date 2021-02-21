package com.example.demo.arithmetic.sort;

import com.alibaba.fastjson.JSON;

/**
 * @Author: tbq
 * @DateTime: 2020/12/27 10:04 AM
 * @Description: 快速排序
 */
public class QuickerSorter extends Sort {

    public void sort(int[] data) {
        if (data == null || data.length < 2) {
            return;
        }
        sort(data, 0, data.length - 1);

    }

    //子问题
    private void sort(int[] data, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        //分区逻辑
        int j = partition(data, lo, hi);

        //对左边数组排序
        sort(data, lo, j - 1);

        //对右边数组排序
        sort(data, j + 1 , hi);


    }

    //分区逻辑
    private int partition(int[] data, int lo, int hi) {
        int pivot = data[hi];
        int less = lo;
        int great =lo;

        for (; great <= hi - 1; great++) {
            if (data[great] <  pivot) {
                super.swap(data, less, great);
                less++;
            }
        }
        swap(data, less, great);
        return less;
    }


    public static void main(String[] args) {
        int[] data = new int[]{12, 23, 36, 9, 24, 20};
        new QuickerSorter().sort(data);
        System.out.println(JSON.toJSONString(data));

    }


}
