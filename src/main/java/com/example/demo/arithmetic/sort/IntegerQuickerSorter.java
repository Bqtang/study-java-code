package com.example.demo.arithmetic.sort;

import java.util.ArrayList;

/**
 * @Author: tbq
 * @DateTime: 2020/12/27 3:05 PM
 * @Description:
 */
public class IntegerQuickerSorter extends Sort {

    public void sort(ArrayList<Integer> data) {
        if (data == null || data.size() <= 1) {
            return;
        }
        Integer[] dataArr = data.toArray(new Integer[data.size()]);
        sort(dataArr, 0, dataArr.length - 1);
        data.clear();
        for (Integer i : dataArr) data.add(i);
    }

    //子问题
    private void sort(Integer[] data, int lo, int hi) {
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
    private int partition(Integer[] data, int lo, int hi) {
        int pivot = data[hi];
        int less = lo;
        int great =lo;

        for (; great <= hi - 1; great++) {
            if (data[great] <  pivot) {
                super.integerSwap(data, less, great);
                less++;
            }
        }
        integerSwap(data, less, great);

        return less;
    }



}
