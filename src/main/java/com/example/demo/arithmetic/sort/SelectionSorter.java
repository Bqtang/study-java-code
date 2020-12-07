package com.example.demo.arithmetic.sort;

import com.alibaba.fastjson.JSON;

/**
 * @Description: 选择排序
 * @Auther: tangbingqun
 * @Date: 2020/11/29 3:01 PM
 * <p>
 * 12，23，36，9，24，42，8
 */

public class SelectionSorter extends Sort {

     public void sort(int[] data) {
          if (data == null || data.length == 1) {
               return;
          }

          for (int i = 0; i < data.length; i++) {
               int minNumIndex = i;
               //选择最小的元素往后进行排序操作
               for (int j = i + 1; j < data.length; j++) {
                    if (data[minNumIndex] > data[j]) {
                         minNumIndex = j;
                    }
               }

               super.swap(data, i, minNumIndex);
          }
     }

     public static void main(String[] args) {
          int[] data = new int[]{12, 23, 36, 9, 24, 42};
          new SelectionSorter().sort(data);
          System.out.println("获取：" + JSON.toJSONString(data));
     }

}
