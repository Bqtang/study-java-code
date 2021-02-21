package com.example.demo.arithmetic.tree.rb;

/**
 * @Author: tbq
 * @DateTime: 2021/1/17 7:32 PM
 * @Description: 二叉查找树增加节点
 */
public class RBTree<E extends Comparable> {

     private static boolean BLACK  = false;
     private static boolean RED = true;

     private class TreeNode {
          E data;
          TreeNode left;
          TreeNode right;
          boolean color; //颜色

          public TreeNode(E data) {
               this.data = data;
               this.color = RED;
          }
     }

     private TreeNode root;
     private int size;


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

          //维护以node 为根节点的子树的黑平衡


          return note;
     }

     //使用递归查询查询元素。
     private TreeNode find(TreeNode note, E e){
          if (note == null){
               return null;
          }
          if (e.compareTo(note.data) == 0){
               return note;
          }else if(e.compareTo(note.data) < 0){
               return note.left;
          }else {
               return note.right;
          }
     }

     //递归删除最小节点
     private TreeNode removeMin(TreeNode node){
          if (node.left == null){
               TreeNode rightNode = node.right;
               node.right = null;
               size --;
               return rightNode;
          }

          TreeNode leftRoot = removeMin(node.left);
          node.left = leftRoot;
          return node;
     }



}
