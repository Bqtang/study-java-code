package com.example.demo.arithmetic.tree.iteration;

import java.util.*;

/**
 * @Description: 链式存储树结构（迭代遍历）
 * @Auther: tangbingqun
 * @Date: 2021/1/10 11:16 AM
 */

public class IterationTreeNode<E> {


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
     public static List<Integer> preOrder(TreeNode<Integer> root) {
          List<Integer> result = new ArrayList<>();
          if (root == null) {
               return result;
          }

          Stack<TreeNode<Integer>> stack = new Stack<>();
          stack.push(root);
          while (!stack.isEmpty()) {
               TreeNode<Integer> curr = stack.pop();
               result.add(curr.data);

               if (curr.right != null) {
                    stack.push(curr.right);
               }
               if (curr.left != null) {
                    stack.push(curr.left);
               }

          }
          return result;
     }


     /**
      * 树的中序遍历
      *
      * @param root
      * @return
      */
     public static List<Integer> inOrder(TreeNode<Integer> root) {

          List<Integer> result = new ArrayList<>();
          if (root == null) {
               return result;
          }
          Stack<TreeNode<Integer>> stack = new Stack<>();
          TreeNode<Integer> curr = root;
          while (curr != null || !stack.isEmpty()) {
               while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
               }
               TreeNode<Integer> node = stack.pop();
               result.add(node.data);
               curr = curr.right;
          }
          return result;

     }


     /**
      * 树的后序遍历(基于前序遍历处理)
      * 前序遍历：  根节点 -> 左节点  -> 右节点
      * <p>
      * 前序遍历变形： 根节点 -> 右节点 -> 左节点
      * <p>
      * 后序遍历：  左节点 -> 右节点 -> 根节点
      *
      * @param root
      * @return
      */
     public static List<Integer> postOrder(TreeNode<Integer> root) {
          LinkedList<Integer> result = new LinkedList<>();
          if (root == null) {
               return result;
          }
          Stack<TreeNode<Integer>> stack = new Stack();
          stack.add(root);
          while (!stack.isEmpty()) {
               TreeNode<Integer> curr = stack.pop();
               result.addFirst(curr.data);
               if (root.left != null) {
                    stack.push(curr.left);
               }
               if (root.right != null) {
                    stack.push(curr.right);
               }
          }
          return result;
     }


     /**
      * 树的层序遍历
      *
      * @return
      */
     public static List<Integer> levelOrder(TreeNode<Integer> root) {
          List<Integer> result = new ArrayList<>();
          if (root == null) {
               return result;
          }
          Queue<TreeNode<Integer>> queue = new LinkedList<>();
          queue.offer(root);
          while (!queue.isEmpty()) {
               TreeNode<Integer> curr = queue.poll();
               result.add(curr.data);
               if (curr.left != null) {
                    queue.offer(curr.left);
               }
               if (curr.right != null) {
                    queue.offer(curr.right);
               }
          }
          return result;
     }

     /**
      * 层序遍历分层。
      * @param root
      * @return
      */
     public static List<List<Integer>>  levelOrder_2(TreeNode<Integer> root){
          List<List<Integer>>  result = new ArrayList<>();


          return result;
     }
}
