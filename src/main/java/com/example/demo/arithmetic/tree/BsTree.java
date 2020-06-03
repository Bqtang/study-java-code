package com.example.demo.arithmetic.tree;

/**
 * @Description:  二分搜索树 （主要使用递归）
 * @Auther: tangbingqun
 * @Date: 2020/5/19 8:07 AM
 */

public class BsTree<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BsTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }

    }

    //向以node为根的二分搜索树中插入元素E，递归算法。(旧)
    private void add(Node node, E e) {
        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }

        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }

    //看二分搜索树中是否包含元素e
    public boolean contains(E e) {
        return contains(root, e);
    }

    //看以node 为根的二分搜索树中是包含元素e, 递归算法
    private boolean contains(Node node, E e){
        if (node == null){
            return false;
        }
        if (e.compareTo(node.e) == 0){
            return true;
        } else if(e.compareTo(node.e) < 0){
            contains(node.left, e);
        } else {
            contains(node.right, e);
        }
        return false;
    }

    //改进后的代码。
    public void addNew(E e){
        root = addNew(root, e);
    }

    //返回插入新节点后二分搜索树的根
    private Node addNew(Node node, E e){
        if (node == null){
            size ++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0){
            node.left = addNew(node.left, e);
        }else if(e.compareTo(node.e) > 0){
            node.right = addNew(node.right, e);
        }
        return node;
    }




    @Override
    public String toString(){
        StringBuilder  res = new StringBuilder();
        gennerateBSTString(root,0,res);
        return res.toString();
    }
    private void gennerateBSTString(Node node, int depth, StringBuilder res){
        if (node == null){
            res.append(gennerateDepthString(depth) + "null\n");
            return;
        }
    }

    private String  gennerateDepthString(int depth){
        StringBuilder  res = new StringBuilder();
        for (int i =0; i < depth; i ++){
            res.append("--");
        }
        return res.toString();
    }

    //二分搜索树递归操作(前序遍历)
    public void preOrder(){
        preOrder(root);
    }

    //前序遍历以node为根的二分搜索树， 递归算法。
    private void  preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println("打印"+ node.e);
        preOrder(node.left);
        preOrder(node.right);
    }



    //二分搜索树的中序遍历
    public void  inOrder(){
        inOrder(root);
    }

    //中序遍历
    private void inOrder(Node  node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    //二分搜索树的后序遍历
    public void  postOrder(){
        postOrder();

    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println("获取相关的值：" + node.e);
    }

    //二分搜索树的层序遍历
    public void  levelOrder(){


    }

    public E minimum(){
        if (size == 0){
            throw  new IllegalArgumentException("BST is empty");
        }
        return  minimum(root).e;
    }

    private Node minimum(Node  node){
        if (node.left == null){
            return node;
        }
        return minimum(node.left);
    }







}
