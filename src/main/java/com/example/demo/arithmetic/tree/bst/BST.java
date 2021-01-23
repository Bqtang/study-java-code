package com.example.demo.arithmetic.tree.bst;

/**
 * @Author: tbq
 * @DateTime: 2021/1/17 7:32 PM
 * @Description: 二叉查找树增加节点
 */
public class BST<E extends Comparable> {

     private class TreeNode {
          E data;
          TreeNode left;
          TreeNode right;

          public TreeNode(E data) {
               this.data = data;
          }
     }

     private TreeNode root;
     private int size;

     public BST() {
          this.root = null;
          this.size = 0;
     }

     public boolean isEmpty() {
          return this.size == 0;
     }


     /**
      * 插入节点优化
      *
      * @param e
      */

     public void add(E e) {
          if (root == null) {
               root = new TreeNode(e);
          } else {
               TreeNode curr = root;
               while (curr != null) {
                    if (e.compareTo(curr.data) == 0) {
                         return;
                    } else if (e.compareTo(curr.data) < 0 && curr.left == null) {
                         curr.left = new TreeNode(e);
                         size++;
                         return;
                    } else if (e.compareTo(curr.data) > 0 && curr.right == null) {
                         curr.right = new TreeNode(e);
                         size++;
                         return;
                    }

                    if (e.compareTo(curr.data) < 0) {
                         curr = curr.left;
                    } else {
                         curr = curr.right;
                    }
               }
          }

     }

     /**
      * 查找二叉树是否包含该元素
      *
      * @param target
      * @return
      */
     public Boolean contains(E target) {
          if (root == null) {
               return false;
          }
          TreeNode curr = root;
          while (curr != null) {
               if (target.compareTo(curr.data) == 0) {
                    return true;
               } else if (target.compareTo(curr.data) < 0) {
                    curr = curr.left;
               } else {
                    curr = curr.right;
               }
          }
          return false;
     }


     /**
      * 查询最小值
      *
      * @return
      */
     public E minValue() {
          if (root == null) {
               throw new RuntimeException("tree is null");
          }
          TreeNode min = root;
          if (min.left != null) {
               min = min.left;
          }

          return min.data;
     }


     /**
      * 查询最大值
      *
      * @return
      */
     public E maxValue() {
          if (root == null) {
               throw new RuntimeException("tree is null");
          }
          TreeNode max = root;
          if (max.right != null) {
               max = max.right;
          }
          return max.data;
     }

     /**
      * 移除最小节点值
      *
      * @return
      */
     public E removeMin() {
          if (root == null) {
               throw new RuntimeException("tree is null");
          }

          TreeNode min = root;
          TreeNode parent = null;
          while (min.left != null) {
               parent = min;
               min = min.left;
          }
          parent.left = min.right;
          size--;
          return min.data;
     }

     /**
      * 删除最大节点
      *
      * @return
      */
     public E removeMax() {
          if (root == null) {
               throw new RuntimeException("tree is null");
          }
          TreeNode max = root;
          TreeNode parent = null;
          while (max.right != null) {
               parent = max;
               max = max.right;
          }
          parent.left = max.right;
          size--;
          return max.data;
     }


}
