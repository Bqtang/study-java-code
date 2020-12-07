package com.example.demo.arithmetic.sort;

import com.alibaba.fastjson.JSON;

/**
 * @Description: 插入排序
 * @Auther: tangbingqun
 * @Date: 2020/11/29 4:12 PM
 * <p>
 * 12，23，36，9，24，42，8
 */

public class InsertionSorter extends Sort {

     public void sort(int[] data) {
          if (data == null || data.length <= 1) {
               return;
          }
          //控制插入排序的轮数
          for (int i = 1; i < data.length; i++) {

               for (int j = i; j > 0; j--) {
                    if (data[j] < data[j - 1]) {
                         super.swap(data, j, j - 1);
                    } else {
                         break;
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
