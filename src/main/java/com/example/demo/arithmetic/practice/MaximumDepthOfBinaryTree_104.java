package com.example.demo.arithmetic.practice;

import java.util.Stack;

/**
 * @Description: 数的最大深度
 * @Auther: tangbingqun
 * @Date: 2021/1/11 3:35 PM
 *
 *
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */

public class MaximumDepthOfBinaryTree_104 {

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

          System.out.println("获取相关的值：" + maxDepth_2(root) );



     }

     private static class Node {
          TreeNode<Integer> node;
          int depth;

          public Node(TreeNode<Integer> node, int depth) {
               this.node = node;
               this.depth = depth;
          }
     }

     /**
      * 递归调用获取树的深度。
      * @param root
      * @return
      */
     public static Integer maxDepth_2(TreeNode root) {
          if (root == null) {
               return 0;
          }
          int leftMaxDepth = maxDepth_2(root.left);
          int rightMaxDepth = maxDepth_2(root.right);
          return Math.max(leftMaxDepth, rightMaxDepth) + 1;
     }

     /**
      * BFS
      * 前序遍历树的最大深度
      *
      * @param root
      * @return
      */
     public static Integer maxDepth(TreeNode<Integer> root) {
          if (root == null) {
               return 0;
          }
          int maxDepth = 0;
          Stack<Node> stack = new Stack();
          stack.push(new Node(root, 1));
          while (!stack.isEmpty()) {
               Node currNode = stack.pop();
               TreeNode<Integer> node = currNode.node;
               int currDepth = currNode.depth;
               if (node.left != null) {
                    stack.push(new Node(node, currDepth + 1));
               }
               if (node.right != null) {
                    stack.push(new Node(node, currDepth + 1));
               }
               maxDepth = Math.max(maxDepth, currDepth);
          }
          return maxDepth;
     }


}
