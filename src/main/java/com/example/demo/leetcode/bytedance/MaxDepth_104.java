package com.example.demo.leetcode.bytedance;

import java.util.Stack;

/**
 * @Description: 104. 二叉树的最大深度
 * @Auther: tangbingqun
 * @Date: 2021/2/22 4:40 PM
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
public class MaxDepth_104 {
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode() {
          }

          TreeNode(int val) {
               this.val = val;
          }

          TreeNode(int val, TreeNode left, TreeNode right) {
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     public class Node {
          TreeNode treeNode;
          int depth;

          public Node(TreeNode treeNode, int depth) {
               this.treeNode = treeNode;
               this.depth = depth;
          }

     }


     /**
      * 求解二叉树的最大深度 （进行广度搜索）
      * 通过栈进行递归处理
      *
      * @param root
      * @return
      */
     public int maxDepthStack(TreeNode root) {
          if (root == null) {
               return 0;
          }
          int maxDepth = 0;
          Stack<Node> stack = new Stack();
          stack.push(new Node(root, 1));

          while (!stack.isEmpty()) {
               Node node = stack.pop();
               TreeNode currNode = node.treeNode;
               int currDepth = node.depth;

               if (currNode.left != null) {
                    stack.push(new Node(currNode.left, currDepth + 1));
               }

               if (currNode.right != null) {
                    stack.push(new Node(currNode.right, currDepth + 1));
               }
               maxDepth = Math.max(currDepth, maxDepth);
          }

          return maxDepth;
     }



     /**
      * 递归求树的深度
      *
      * @param root
      * @return
      */
     public int maxDepthRecursion(TreeNode root) {
          if (root == null) {
               return 0;
          }
          return 1 + Math.max(maxDepthRecursion(root.left), maxDepthRecursion(root.right));
     }
}
