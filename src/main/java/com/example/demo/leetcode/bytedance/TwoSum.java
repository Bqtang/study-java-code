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
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> tempMap = new HashMap(len - 1);
        for (int i = 0; i < len; i++) {
            int another = target - nums[i];
            if (tempMap.containsKey(another)) {
                return new int[]{tempMap.get(another), i};
            }
            tempMap.put(nums[i], i);
        }
        return new int[]{};
    }


}
