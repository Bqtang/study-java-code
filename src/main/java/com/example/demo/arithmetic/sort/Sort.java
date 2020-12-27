package com.example.demo.arithmetic.sort;

import java.util.ArrayList;

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

     public void integerSwap(Integer[] data, int i, int j) {
          int tmp = data[i];
          data[i] = data[j];
          data[j] = tmp;
     }
}
