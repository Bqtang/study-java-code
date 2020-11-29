package com.example.demo.arithmetic.teachPractice;

/**
 * @Description: 颜色分类(三路快排)
 * @Auther: tangbingqun
 * @Date: 2020/7/5 9:05 AM
 * <p>
 * 题目：
 * <p>
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * <p>
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 */

public class Practice_75_array_quick_sort {

    public void sortColors(int[] nums) { //三路快排思路
        //设置相关的初始值
        int zero = -1;           //nums[0.....zero] = 0;
        int two = nums.length;  //nums[two.....n-1] == 2;
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                swap(nums[i], nums[--two]);
            } else {//nums[i] == 0
                assert (nums[i] == 0);
                swap(nums[++zero], nums[i++]);
            }
        }
    }

    private void swap(int a, int b) {
        int flag = a;
        a = b;
        b = flag;
    }

}
