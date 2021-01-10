package com.example.demo.arithmetic.sort;

import com.alibaba.fastjson.JSON;

/**
 * @Author: tbq
 * @DateTime: 2020/12/27 2:06 PM
 * @Description: 三路排序法。
 */
public class ThreeWayQuickSorter  {

    public class PartitionSegment {
        public int less;
        public int great;

        public PartitionSegment(int less, int great) {
            this.less = less;
            this.great = great;
        }
    }

    public void sort(int[] data) {
        if (data == null || data.length <= 1) {
            return;
        }

        sort(data, 0, data.length);
    }

    private void sort(int[] data, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        PartitionSegment partitionSegment = partition(data, lo, hi);
        int less = partitionSegment.less;
        int great = partitionSegment.great;

        sort(data, lo, less - 1);
        sort(data, great + 1, hi);

    }

    public void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public PartitionSegment partition(int[] data, int lo, int hi) {
        int pivot = data[hi];
        int less = lo;
        int great = hi;
        int i = lo;

        while (i <= great) {
            if (data[i] < pivot) {
                swap(data, i, less);
                less++;
                i++;

            } else if (data[i] > pivot) {
                swap(data, i, great);
                great--;
                i ++;

            } else {
                i++;

            }
        }
        return new PartitionSegment(less, great);
    }


    public static void main(String[] args) {
        int[] data = new int[]{12, 23, 36, 9, 24, 20,1,23,8,23,99};
        new QuickerSorter().sort(data);
        System.out.println(JSON.toJSONString(data));

    }

}
