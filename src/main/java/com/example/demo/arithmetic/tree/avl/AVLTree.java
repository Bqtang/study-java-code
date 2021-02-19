package com.example.demo.arithmetic.tree.avl;

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
     private TreeNode add(TreeNode note, E e) {
          if (note == null) {
               size++;
               return new TreeNode(e);
          }
          if (e.compareTo(note.data) < 0) {
               return add(note.left, e);
          }
          if (e.compareTo(note.data) > 0) {
               return add(note.right, e);
          }
          //更新父亲节点的高度值
          //父亲节点的高度值等于左右子节点最大的高度值加上1
          note.height = Math.max(getHeight(note.left), getHeight(note.right)) + 1;


          return note;
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

}
