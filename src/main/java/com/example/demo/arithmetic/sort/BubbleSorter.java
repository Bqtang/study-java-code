package com.example.demo.arithmetic.sort;

import java.util.Arrays;

/**
 * @Description: 冒泡排序
 * @Auther: tangbingqun
 * @Date: 2020/11/29 11:26 AM
 * <p>
 * 12，23，36，9，24，42，8
 */

public class BubbleSorter extends Sort {
     /**
      * 时间复杂度 O(n^2)
      * 空间复杂度 O(1)
      * 优化冒泡排序
      *
      * @param data
      * @return
      */
     public void sort(int[] data) {
          if (data == null || data.length <= 1) {
               return;
          }
          //控制冒泡轮数
          for (int round = 1; round <= data.length; round++) {
               //已经排序好了，就不用再进行循环排序了。
               Boolean hasSwap = Boolean.FALSE;
               int compareTimes = data.length - round;
               //控制每轮冒泡次数
               for (int j = 0; j < compareTimes; j++) {
                    if (data[j] > data[j + 1]) {
                         super.swap(data, j, j + 1);
                         hasSwap = Boolean.TRUE;
                    }
               }
               if (!hasSwap) {
                    break;
               }
          }
     }


     public static void main(String[] args) {
          int[] data = new int[]{12, 23, 36, 9, 24, 42};
          new BubbleSorter().sort(data);
          System.out.println(Arrays.toString(data));

     }

}
