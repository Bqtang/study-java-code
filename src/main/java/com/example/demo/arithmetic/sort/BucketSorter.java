package com.example.demo.arithmetic.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: tbq
 * @DateTime: 2020/12/27 2:33 PM
 * @Description: 桶排序
 */
public class BucketSorter {

    public void  sort(int[] data){
        if (data == null || data.length <= 1 ){
            return;
        }

        //1.创建几个空的bucket
        int maxValue = data[0];
        for (int d : data){
            maxValue = Math.max(maxValue, d);
        }
        int bucketNum = maxValue / 10 + 1;

        ArrayList<Integer>[] buckets = new ArrayList[bucketNum];

        //2.将所有的元素放入桶里面
        for (int i = 0; i <data.length ; i++) {
            int index = data[i] / 10;
            if (buckets[index] == null){
                buckets[index] = new ArrayList<>();
            }
            buckets[index].add(data[i]);

        }

        //3. 对每个bucket 中的元素进行排序
        for (int i = 0; i <bucketNum ; i++) {
            ArrayList<Integer> bucketData = buckets[i];
            if (bucketData != null){
                new IntegerQuickerSorter().sort(bucketData);
            }

        }

        //4. 从buckets 中拿到排序后的数组
        int index = 0;
        for (int i = 0; i <bucketNum ; i++) {
            ArrayList<Integer> bucketData = buckets[i];
            if (bucketData != null){
                for (int j = 0; j <bucketData.size() ; j++) {
                    data[index ++] = bucketData.get(j);
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] data = new int[]{23, 5, 13, 16, 32, 11,9,37,27,19,3,37,24,8,35};
        new BucketSorter().sort(data);
        System.out.println(Arrays.toString(data));

    }


}
