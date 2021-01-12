package com.example.demo.arithmetic.sort;

/**
 * @Author: tbq  计数排序
 * @DateTime: 2020/12/27 3:47 PM
 * @Description:
 */
public class CountSorter extends Sort {

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }

        //找到数组中的最大值
        int max = data[0];
        for (int a : data) {
            max = Math.max(max, a);
        }
        //1. 初始化计数长度
        int[] count = new int[max + 1];

        //2. 计数
        for (int i = 0; i < data.length; i++) {
            count[data[i]]++;
        }

        //3.计数累加
        for (int i = 0; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        //4.计算每个元素在排序数组中的位置
        int[] output = new int[data.length];

        for (int i = data.length - 1; i >= 0; i--) {
            int j = data[i];
            int k = count[j] - 1;
            output[k] = data[i];
            count[j]--;

        }

        //5.拷贝数组
        for (int i = 0; i < data.length; i++) {
            data[i] = output[i];
        }

    }
}
