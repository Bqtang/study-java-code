package com.example.demo.arithmetic.sort;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 希尔排序
 * @Auther: tangbingqun
 * @Date: 2020/12/6 11:28 AM
 */

public class ShellSorter extends Sort {

     public void sort(int[] data) {
          if (data == null || data.length < 0) {
               return;
          }

          //计算递增序列
          /**
           * (3^K -1) / 2
           */
          List<Integer> increaseEle = new ArrayList<>();
          int n = data.length;
          int k = 1;
          int h;
          do {
               h = ((int) Math.pow(3, k) - 1) / 2;
               if (h > n / 3) {
                    break;
               }
               k++;
          } while (h <= n / 3);

          //希尔排序
          for (k = increaseEle.size(); k > 0; k--) {
               h = increaseEle.get(k);
               for (int i = h; i < n; i++) {
                    for (int j = i; j >= h; j = j - h) {
                         if (data[j] < data[j - h]) {
                              swap(data, j, j - h);
                         } else {
                              break;
                         }
                    }
               }
          }

     }

     public static void main(String[] args) {
          int[] data = new int[]{12, 23, 36, 9, 24, 42};
          new SelectionSorter().sort(data);
          System.out.println("获取：" + JSON.toJSONString(data));

     }


}
