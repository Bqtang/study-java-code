package com.example.demo.arithmetic.tree.recursion;



import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 递归遍历树
 * @Auther: tangbingqun
 * @Date: 2021/1/11 4:22 PM
 */

public class RecursionTreeNode<E> {

     public static void main(String[] args) {
          TreeNode<Integer> root = new TreeNode<Integer>(23);
          TreeNode<Integer> note1 = new TreeNode<Integer>(34);
          TreeNode<Integer> note2 = new TreeNode<Integer>(21);
          TreeNode<Integer> note3 = new TreeNode<Integer>(45);
          TreeNode<Integer> note4 = new TreeNode<Integer>(99);
          TreeNode<Integer> note5 = new TreeNode<Integer>(90);

          root.left = note1;
          root.right = note2;

          note1.left = note4;
          note1.right = note5;

          note2.right = note3;
          preOrderR(root);
     }

     /**
      * 树的前序递归遍历
      *
      * @param root
      */
     public static void preOrderR(TreeNode<Integer> root) {
          List<Integer> result = new ArrayList<Integer>();
          preOrder(root, result);
          System.out.println(result);
     }

     public static void preOrder(TreeNode<Integer> root, List<Integer> result){
          if (root == null){
               return;
          }
          result.add(root.data);
          preOrder(root.left, result);
          preOrder(root.right, result);
     }





}
