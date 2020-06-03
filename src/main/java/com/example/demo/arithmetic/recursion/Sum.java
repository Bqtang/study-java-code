package com.example.demo.arithmetic.recursion;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/5/18 2:56 PM
 */

public class Sum {


    public static int sum(int[] arr){
        return sum(arr,0);
    }

    public static int sum(int[] arr, int l){
        //求解最基本的问题。
        if (l == arr.length){
            return 0;
        }
        //递归执行（将原问题转化成更小的问题）
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = sum(arr);
        System.out.println("求和：sum =" + sum);
    }
}
