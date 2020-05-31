package com.example.demo.arithmetic.tree;

public class RemoveElements {

    //demo  6 - 7 - 8 - null;
    public ListNode removeElements(ListNode head,int val){
        if (head == null){
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next: head;
    }







}
