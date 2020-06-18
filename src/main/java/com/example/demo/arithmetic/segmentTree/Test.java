package com.example.demo.arithmetic.segmentTree;

import com.alibaba.fastjson.JSON;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/6/17 8:10 AM
 */

public class Test {

    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};

        SegmentTree<Integer> segTree = new SegmentTree<>(nums, (a, b) -> a + b);
        System.out.println(JSON.toJSONString(segTree));




    }
}
