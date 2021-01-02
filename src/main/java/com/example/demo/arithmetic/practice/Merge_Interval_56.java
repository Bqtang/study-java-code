package com.example.demo.arithmetic.practice;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: 合并区间
 * @Auther: tangbingqun
 * @Date: 2021/1/2 1:47 PM
 *
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 *
 * 输入: intervals = [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 */

public class Merge_Interval_56 {


     public static int[][] merge(int[][] intervals) {
          if(intervals == null){
               return null;
          }
          Arrays.sort(intervals,  new Comparator<int[]>(){
               @Override
               public int compare(int[] o1, int[] o2){
                    return o1[0] - o2[0];
               }
          });

          ArrayList<int[]> outputs = new ArrayList();
          for(int i = 0; i < intervals.length; i ++){
               int[]  currInterval = intervals[i];
               if(outputs.isEmpty()){
                    outputs.add(currInterval);
               } else {
                    int[]  outputLastInterval = outputs.get(outputs.size() - 1);
                    int outputLastRight = outputLastInterval[1];
                    int currIntervalLeft = currInterval[0];
                    if(outputLastRight < currIntervalLeft){
                         outputs.add(currInterval);
                    } else{
                         int currRight = currInterval[1];
                         outputLastInterval[1] = Math.max(outputLastRight, currRight);
                    }

               }
          }
          return  outputs.toArray(new int[outputs.size()][]);
     }

     public static void main(String[] args) {

          int[][] arr1 = {{1,4}, {2, 6}, {7, 10}};
          int[][] merge = merge(arr1);
          System.out.println("获取相关的值：" + JSON.toJSONString(merge));
     }

}
