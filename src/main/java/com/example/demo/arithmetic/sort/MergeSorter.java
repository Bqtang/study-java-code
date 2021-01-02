package com.example.demo.arithmetic.sort;

import com.alibaba.fastjson.JSON;

/**
 * @Description:  递归进行--归并排序
 * @Auther: tangbingqun
 * @Date: 2020/12/12 9:36 AM
 */

public class MergeSorter {

     public void sort(int[] data) {
          if (data == null || data.length < 2) {
               return;
          }
          sort(data, 0, data.length - 1);
     }

     private void sort(int[] data, int left, int right) {
          if (left == right) {
               return;
          }

          int mid = (left + right) / 2;
          sort(data, left, mid);
          sort(data, mid + 1, right);

          merge(data, left, mid, right);

     }

     private void merge(int[] data, int left, int mid, int right) {
          int num = left + right - 1;
          int[] temp = new int[num];
          int tmpPos = 0;
          int i = left;
          int j = mid + 1;
          while (i <= mid && j <= right) {
               if (data[i] <= data[j]) {
                    temp[tmpPos++] = data[i++];
               } else {
                    temp[tmpPos++] = data[j++];
               }
          }

          while (i < mid) {
               temp[tmpPos++] = data[i++];
          }

          while (j < right) {
               temp[tmpPos++] = data[j++];
          }

          for (int k = 0; k < temp.length; k++) {
               data[k] = temp[k];
          }
     }

     public static void main(String[] args) {
          int[] data = new int[]{1, 9, 30, 13, 20, 44, 80, 12, 4};

          new MergeSorter().sort(data);
          System.out.println(JSON.toJSONString(data));


     }


}
