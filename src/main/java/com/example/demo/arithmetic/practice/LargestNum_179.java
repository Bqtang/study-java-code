package com.example.demo.arithmetic.practice;

import com.alibaba.fastjson.JSON;
import com.example.demo.arithmetic.sort.Sort;

/**
 * @Description: 最大数(用三路快排实现最大值)
 * @Auther: tangbingqun
 * @Date: 2021/1/2 2:33 PM
 * <p>
 * 给定一组非负整数 nums，重新排列它们每个数字的顺序（每个数字不可拆分）使之组成一个最大的整数。
 * <p>
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * <p>
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 示例 3：
 * <p>
 * 输入：nums = [1]
 * 输出："1"
 * 示例 4：
 * <p>
 * 输入：nums = [10]
 * 输出："10"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 */

public class LargestNum_179 extends Sort {

     //排序
     class PartitionSegment {
          private int less;
          private int great;

          public PartitionSegment(int less, int great) {
               this.less = less;
               this.great = great;
          }
     }
     /**
      * 实现三路快排
      *
      * @param data
      */
     public String threeWayQuickSorter(int[] data) {

          sort(data, 0, data.length - 1);
          if (data[0] == 0) {
               return "0";
          }
          StringBuilder str = new StringBuilder();
          for (int i : data){
               str.append(i);
          }
          return str.toString();
     }


     private void sort(int[] data, int lo, int hi) {
          if (lo >= hi) {
               return;
          }

          PartitionSegment partitionSegment = partition(data, lo, hi);
          int less = partitionSegment.less;
          int great = partitionSegment.great;

          sort(data, lo, less -1 );
          sort(data, great +1, hi);
     }


     private PartitionSegment partition(int[] data, int lo, int hi) {
          //定义指针
          int pivot = data[hi];
          int less = lo;
          int great = hi;
          int i = lo;

          while (i <= great) {
               String xy = data[i] + "" + pivot;
               String yx = pivot + "" + data[i];
               if (xy.compareTo(yx) > 0) {
                    swap(data, i, less);
                    less++;
                    i++;
               } else if (xy.compareTo(yx) < 0) {
                    swap(data, i, great);
                    great--;
               } else {
                    i++;
               }
          }
          return new PartitionSegment(less, great);
     }

     public static void main(String[] args) {
          int[] data = new int[]{3,30,34,5,9};
          System.out.println(new LargestNum_179().threeWayQuickSorter(data));

     }

}
