package com.example.demo.arithmetic.practice;

import java.util.Random;

/**
 * @Description: 利用快排
 * 题目： 数组中的第K个最大元素
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 * <p>
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * <p>
 * 时间复杂度 O(n)的要求
 * @Auther: tangbingqun
 * @Date: 2021/2/21 11:37 AM
 */

public class FindKthLargest_215 {
     private Random random = new Random(System.currentTimeMillis());
     public Integer findKthLargest(int[] nums, int k) {
          int len = nums.length;
          int target = len - k;
          int left = 0;
          int right = len - 1;
          while (true) {
               int index = partition(nums, left, right);
               if (index == target) {
                    return nums[target];
               } else if (index < target) {
                    left = index + 1;
               } else {
                    right = index - 1;
               }
          }
     }


     private int partition(int[] nums, int lo, int hi) {
          if (hi > lo){
               int randomIndex = lo + 1 + random.nextInt(hi - lo);
               swap(nums, hi, randomIndex);
          }
          int pivot = nums[hi];
          int less = lo;
          int great = lo;
          for (;great < hi; great++){
               if (nums[great] < pivot){
                    swap(nums, less, great);
                    less ++;
               }
          }
          swap(nums, less, hi);
          return less;
     }


     private  void swap(int[] nums, int lo, int hi){
          int temp = nums[lo];
          nums[lo] = nums[hi];
          nums[hi] = temp;
     }

     public static void main(String[] args) {
          int[] data = new int[]{12, 23, 36, 9, 24, 20};
          Integer kthLargest = new FindKthLargest_215().findKthLargest(data, 2);
          System.out.println(kthLargest);

     }
}
