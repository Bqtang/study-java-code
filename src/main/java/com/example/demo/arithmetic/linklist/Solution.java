package com.example.demo.arithmetic.linklist;

import com.alibaba.fastjson.JSON;

/**
 * @Description: 203. 移除链表元素  (虚拟头节点)  -- 两个节点
 * @Auther: tangbingqun
 * @Date: 2020/5/16 2:46 PM
 */

public class Solution {

    public ListNote removeElements(ListNote head, int val) {
        //直接去除不要的元素。
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNote prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[]  nums = {1,2,6,3,4,5,6};
        ListNote head = new ListNote(nums);
        System.out.println(JSON.toJSONString(head));
        ListNote  res = (new Solution()).removeElements(head,6);
        System.out.println("获取的数据：" + JSON.toJSONString(res));
    }
}
