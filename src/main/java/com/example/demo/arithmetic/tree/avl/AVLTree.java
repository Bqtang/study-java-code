package com.example.demo.arithmetic.tree.avl;

import java.util.List;

/**
 * @Description: AVL树
 * @Auther: tangbingqun
 * @Date: 2021/2/10 10:38 AM
 */

public class AVLTree<E extends Comparable> {
     private class TreeNode {
          E data;
          TreeNode left;
          TreeNode right;
          int height = 1;

          public TreeNode(E data) {
               this.data = data;
          }
     }

     private TreeNode root;
     private int size;

     public AVLTree() {
          this.root = null;
          this.size = 0;
     }

     private int getHeight(TreeNode node) {
          if (node == null) {
               return 0;
          }
          return node.height;
     }

     //递归实现
     //时间复杂度（O(n)）
     public void add(E e) {
          root = add(root, e);
     }

     //将节点e 插入到以 note 节点的子树当中
     private TreeNode add(TreeNode node, E e) {
          if (node == null) {
               size++;
               return new TreeNode(e);
          }
          if (e.compareTo(node.data) < 0) {
               return add(node.left, e);
          }
          if (e.compareTo(node.data) > 0) {
               return add(node.right, e);
          }
          //更新父亲节点的高度值
          //父亲节点的高度值等于左右子节点最大的高度值加上1
          node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

          //计算每一个父亲节点的平衡因子
          int balanceFactor = getBalanceFactor(node);
          //平衡二叉树判断条件。
          if (Math.abs(balanceFactor) > 1) {
               System.out.println("当前的二叉树不是平衡二叉树，平衡因子为：" + balanceFactor);
          }


          return node;
     }

     //使用递归查询查询元素。
     private TreeNode find(TreeNode note, E e) {
          if (note == null) {
               return null;
          }
          if (e.compareTo(note.data) == 0) {
               return note;
          } else if (e.compareTo(note.data) < 0) {
               return note.left;
          } else {
               return note.right;
          }
     }

     //递归删除最小节点
     private TreeNode removeMin(TreeNode node) {
          if (node.left == null) {
               TreeNode rightNode = node.right;
               node.right = null;
               size--;
               return rightNode;
          }

          TreeNode leftRoot = removeMin(node.left);
          node.left = leftRoot;
          return node;
     }

     /**
      * 获取节点的平衡因子（平衡因子）
      *
      * @param node
      * @return
      */
     private int getBalanceFactor(TreeNode node) {
          if (node == null) {
               return 0;
          }
          //平衡因子等于左右子节点的高度差
          return getHeight(node.left) - getHeight(node.right);
     }


     /**
      * 判断一棵二叉树是否是二叉树
      *
      * @return
      */
     public boolean isBST() {
          //2.先中序遍历二叉查找树，得到遍历的结果列表
          List<E> res = inOrder();
          int len = res.size();
          if (len <= 1) {
               return true;
          }
          //然后判断结果列表是否是增序排列的。
          //中序遍历  判断结果列表是不是增序的。
          for (int i = 1; i < len; i++) {
               if (res.get(i).compareTo(res.get(i - 1)) < 0) {
                    return false;
               }
          }
          return true;
     }

     /**
      * 判断一棵树是否平衡
      *
      * @return
      */
     public boolean isBalanced() {
          return isBalanced(root);
     }


     private boolean isBalanced(TreeNode node) {
          if (node == null) {
               return true;
          }
          int balanceFactor = getBalanceFactor(node);
          if (Math.abs(balanceFactor) > 1) {
               return false;
          }
          return isBalanced(node.left) && isBalanced(node.right);
     }




     /**
      * 二叉树的中序遍历
      *
      * @return
      */
     private List<E> inOrder() {

          return null;
     }


}
