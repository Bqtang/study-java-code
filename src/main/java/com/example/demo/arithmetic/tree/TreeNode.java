package com.example.demo.arithmetic.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description: 链式存储树结构
 * @Auther: tangbingqun
 * @Date: 2021/1/10 11:16 AM
 */

public class TreeNode<E> {
     E data;
     TreeNode<E> left;
     TreeNode<E> right;

     public TreeNode(E data) {
          this.data = data;
          left = right = null;
     }

     public static void main(String[] args) {
          TreeNode<Integer> root = new TreeNode<>(23);
          TreeNode<Integer> note1 = new TreeNode<>(34);
          TreeNode<Integer> note2 = new TreeNode<>(21);
          TreeNode<Integer> note3 = new TreeNode<>(45);
          TreeNode<Integer> note4 = new TreeNode<>(99);
          TreeNode<Integer> note5 = new TreeNode<>(90);

          root.left = note1;
          root.right = note2;

          note1.left = note4;
          note1.right = note5;

          note2.right = note3;

     }

     /**
      * 树的前序遍历
      *
      * @param root
      * @return
      */
     public static ArrayList<Integer> preOrder(TreeNode<Integer> root) {
          ArrayList<Integer> result = new ArrayList<>();
          if (root == null){
               return result;
          }

          Stack<TreeNode<Integer>>  stack = new Stack<>();
          stack.push(root);
          while (!stack.isEmpty()){
               TreeNode<Integer> curr = stack.pop();
               result.add(curr.data);

               if (curr.right != null){
                    stack.push(curr.right);
               }
               if (curr.left != null){
                    stack.push(curr.left);
               }

          }
          return result;
     }


     /**
      * 树的中序遍历
      * @param root
      * @return
      */
     public static ArrayList<Integer>  inOrder(TreeNode<Integer>  root ){

          ArrayList<Integer>  result = new ArrayList<>();
          if (root == null){
               return result;
          }
          Stack<TreeNode<Integer>>  stack = new Stack<>();
          TreeNode<Integer>  curr = root;
          while (curr != null || !stack.isEmpty()){
               while (curr != null){
                    stack.push(curr);
                    curr = curr.left;
               }
               TreeNode<Integer>  node = stack.pop();
               result.add(node.data);
               curr = curr.right;
          }
          return result;

     }


     /**
      * 树的后序遍历
      * @param root
      * @return
      */
     public static ArrayList<Integer> backOrder(TreeNode<Integer>  root){

          return null;
     }

}
