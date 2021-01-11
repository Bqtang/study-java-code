package com.example.demo.arithmetic.practice;

/**
 * @Description: 链式存储树节点
 * @Auther: tangbingqun
 * @Date: 2021/1/11 3:42 PM
 */

public class TreeNode<E> {
     E data;
     TreeNode<E> left;
     TreeNode<E> right;

     public TreeNode(E data) {
          this.data = data;
          left = right = null;
     }


}
