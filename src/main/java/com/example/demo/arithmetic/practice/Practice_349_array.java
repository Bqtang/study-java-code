package com.example.demo.arithmetic.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @Description: 两个数组的交集 I
 * @Auther: tangbingqun
 * @Date: 2020/6/2 8:36 AM
 *
 * 题目：
 * 给定num1 =[1,2,2,1], num2 =[2,2],  返回 [2]
 *
 * 条件：
 *   输出结果中的每个元素一定是唯一的。
 *   我们可以不考虑输出结果的顺序。
 */

public class Practice_349_array {
    public static int[] intersection(int[] nums1, int[] nums2) {
        TreeSet set = new TreeSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        List<Integer> nums = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                nums.add(num);
                set.remove(num);
            }
        }
        int[] res = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            res[i] = nums.get(i);
        }
        return res;
    }

}
