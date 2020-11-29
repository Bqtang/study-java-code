package com.example.demo.arithmetic.teachPractice;

/**
 * @Description: 1.对撞指针
 * @Auther: tangbingqun
 * @Date: 2020/7/5 10:18 AM
 *
 * 题目：
 *
 * 两数之和 II - 输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 */

public class Practice_167_array_clash_pointer {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l <= r) {
            if (numbers[l] + numbers[r] == target) {
                int[] res = new int[]{l + 1, r + 1};
                return res;
            } else if (numbers[l] + numbers[r] < target) {
                l ++;
            } else {
                r --;
            }
        }
        return null;
    }
}
