package com.example.demo.leetcode.bytedance;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: tbq
 * @DateTime: 2020/12/27 10:23 PM
 * @Description: 题目： 1. 两数之和
 * <p>
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 * 时间复杂度为 O(n)
 *
 */
public class TwoSum_1 {

    /**
     * 时间复杂度 O(n)
     * 空间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_1(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> tempMap = new HashMap(len - 1);
        for (int i = 0; i < len; i++) {
            int another = target - nums[i];
            if (tempMap.containsKey(another)) {
                return new int[]{tempMap.get(another), i};
            }
            tempMap.put(nums[i], i);
        }
        return new int[]{0};
    }

    /**
     * 二次for
     * @param nums
     * @param target
     * @return
     * 时间复杂度 O(2n)
     * 空间复杂度 O(n)
     *
     */
    public int[] twoSum_2(int[] nums, int target){
        if (nums == null  || nums.length == 0){
            return new int[]{0};
        }
        //预处理数据
        Map<Integer, Integer>  map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            map.put(nums[i],i);
        }
        //哈希处理
        for (int i = 0; i < nums.length; i ++){
            int other = target - nums[i];
            if (map.containsKey(other)){
                int index = map.get(other);
                if (i != index)  {
                    return new int[]{i, index};
                }
            }
        }
        return new int[]{0};
    }


    /**
     *
     * 最优解
     * 一次for
     * @param nums
     * @param target
     * @return
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     */
    public int[] twoSum_3(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return new int[]{0};
        }
        Map<Integer, Integer>  map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            int other = target - nums[i];
            if (map.containsKey(other)){
                return new int[]{map.get(other), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0};
    }


    /**
     * 添加二维数组。
     * @param a
     * @param target
     * @return
     */
    public int[][] addElement(int[] a, int target ){
        int k = 0;
        int len = a.length;
        int res[][] = new int[1][len];
        Map<Integer, Integer> tempMap = new HashMap<>(len - 1);
        for (int i = 0; i < len; i++){
            int another = target - a[i];
            if (tempMap.containsKey(another)){
                res[k][0] =another;
                res[k][1]= tempMap.get(another);
                k ++;
            }
            tempMap.put(another,a[i]);
        }
        return res;

    }



}
