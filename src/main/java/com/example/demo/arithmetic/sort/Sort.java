package com.example.demo.arithmetic.sort;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/11/29 3:53 PM
 */

public class Sort {

     public void swap(int[] data, int i, int j) {
          int tmp = data[i];
          data[i] = data[j];
          data[j] = tmp;
     }
}
