package com.example.demo.arithmetic.teachPractice;

/**
 * 算法： 二分查找树
 * @Author: tbq
 * @DateTime: 2020/7/4 4:06 PM
 * @Description: 二分查找树，对应有序数组，找到对应的target
 */
public class BinarySearch_704 {

    public static int binarySearch(int[] arr, int n, int target) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        int data = binarySearch(arr, arr.length, 3);
        System.out.println("获取相关的值：" + data);
    }
}
