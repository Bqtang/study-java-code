package com.example.demo.arithmetic.tree;

import com.alibaba.fastjson.JSON;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/5/29 2:43 PM
 */

public class BsTreeTest {

    public static void main(String[] args) {
        BsTree<Integer> bst = new BsTree<>();
        int[] nums = {5,3,6,8,4,2};
        for (int num : nums){
            bst.add(num);
        }
        System.out.println("获取相关的树：" + JSON.toJSONString(bst));

    }
}
