package com.example.demo.arithmetic.practice;

/**
 * @Description: 颜色分类（三路快排来进行解决）
 * @Auther: tangbingqun
 * @Date: 2021/1/9 4:36 PM
 */

public class SortColor_75 {

     public void sortColors(int[] nums) {
          if(nums == null || nums.length == 0){
               return;
          }
          int[] count = new int[3];
          for(int i = 0; i < nums.length; i ++){
               count[nums[i]] ++;
          }

          int k = 0;
          for(int i = 0; i < count.length; i++){
               for(int j = 0; j < count[i]; j ++){
                    nums[k++] = i;
               }
          }
     }

     public static void main(String[] args) {

     }
}
