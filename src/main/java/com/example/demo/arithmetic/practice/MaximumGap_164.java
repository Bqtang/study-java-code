package com.example.demo.arithmetic.practice;

import java.util.Arrays;

/**
 * @Author: tbq
 * @DateTime: 2021/1/12 9:13 PM
 * @Description: 最大间距
 */
public class MaximumGap_164 {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int maxGap = 0;
        for(int i = 0; i < nums.length; i ++){
            maxGap = Math.max(maxGap, (nums[i + 1] - nums[i]));
        }
        return maxGap;

    }


}
