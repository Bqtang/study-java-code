package com.example.demo.arithmetic.teachPractice;

import com.alibaba.fastjson.JSON;

/**
 * @Author: tbq
 * @DateTime: 2020/7/4 5:28 PM
 * @Description: 题目: 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 1. 必须在原数组上操作，不能拷贝额外的数组。
 * 2. 尽量减少操作次数。
 */
public class Practice_283_array {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("获得相关的数组：" + JSON.toJSONString(nums));
    }
}
