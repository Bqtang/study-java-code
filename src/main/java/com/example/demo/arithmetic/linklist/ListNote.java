package com.example.demo.arithmetic.linklist;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/5/18 8:17 AM
 */

public class ListNote {
    int val;
    ListNote next;
    ListNote(int x) {
        val = x;
    }

    public ListNote (int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("arr can  not  be empty");
        }
        this.val = arr[0];
        ListNote cur = this;
        for(int i = 1; i < arr.length; i++){
            cur.next = new ListNote(arr[i]);
            cur = cur.next;
        }
    }
}
