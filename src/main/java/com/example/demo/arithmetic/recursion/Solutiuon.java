package com.example.demo.arithmetic.recursion;

/**
 * @Description: 203. 移除链表元素  (虚拟头节点)  -- 两个节点
 * @Auther: tangbingqun
 * @Date: 2020/5/18 3:20 PM
 */

public class Solutiuon {

    public ListNote removeElements(ListNote head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next,val);
        //递归删除重复数据
        return head.val == val ? head.next : head;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNote head = new ListNote(nums);
        System.out.println("获取头节点 head = " + head);
        ListNote res = (new Solutiuon()).removeElements(head, 6);
        System.out.println("获取相关的值：" + res);
    }

}
