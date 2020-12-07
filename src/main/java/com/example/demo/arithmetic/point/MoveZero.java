package com.example.demo.arithmetic.point;

import com.alibaba.fastjson.JSON;
import com.example.demo.arithmetic.sort.Sort;

/**
 * @Description: 移动零 双指针移动
 * @Auther: tangbingqun
 * @Date: 2020/12/6 3:52 PM
 */

public class MoveZero {

     public  int[] moveZeros(int[] nums) {
          if (nums == null || nums.length == 0) {
               return new int[]{};
          }
          int j = 0;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] != 0) {
                    swap(nums, i, j);
                    j ++;
               }
          }
          return nums;

     }

     public void swap(int[] data, int i, int j){
          int temp = data[i];
          data[i] = data[j];
          data[j] = temp;
     }


     public static void main(String[] args) {
          int[] data = new int[]{0, 0, 36, 9, 24, 42};
          System.out.println("获取：" + JSON.toJSONString(new  MoveZero().moveZeros(data)));

     }
}
