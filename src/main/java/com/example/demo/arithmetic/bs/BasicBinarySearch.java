package com.example.demo.arithmetic.bs;

/**
 * @Description: 最基本的二分查找法  时间复杂度 O(longn).
 * @Auther: tangbingqun
 * @Date: 2021/1/2 10:38 AM
 */

public class BasicBinarySearch {

     /**
      * 最基本的二分查找法
      * @param nums
      * @param target
      * @return
      */
     public static boolean contains(int[] nums, int target) {
          if (nums == null || nums.length == 0) {
               return false;
          }
          int left = 0;
          int right = nums.length - 1;

          while (left <= right) {
               int mid = (left + right) / 2;
               if (target == nums[mid]) {
                    return true;
               } else if (target < nums[mid]) {
                    right = mid - 1;
               } else {
                    left = mid + 1;
               }
          }
          return false;
     }


     /**
      * 递归查找二分法
      * @param nums
      * @param left
      * @param right
      * @param target
      * @return
      */
     public static boolean containsV2(int[] nums, int left, int right, int target){
          if (left > right){
               return false;
          }
          int mid = (left + right) / 2;
          if (target == nums[mid]){
               return true;
          }
          if (target < nums[mid]){
              return containsV2(nums,left, mid - 1, target);
          } else {
              return containsV2(nums, mid + 1, right, target);
          }

     }


     public static void main(String[] args) {
          int[] nums = {1,3,6,12,16,18,23,24,26,67,77,87,100};
          boolean b = containsV2(nums, 0, nums.length - 1, 24);
          System.out.println("测试2 " + b);
     }
}
