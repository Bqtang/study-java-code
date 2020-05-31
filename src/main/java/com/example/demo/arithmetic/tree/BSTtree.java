package com.example.demo.arithmetic.tree;

/**
 * 二分搜索树结构
 */
public class BSTtree<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BSTtree() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    //向二分搜索树种添加元素
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }
    //二分搜索树的插入：使用递归算法。
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
        }

        if (e.compareTo((E) node.e) > 0) {
            add(node.right, e);
        }
    }

    public void addNew(E e) {
        addNew(root, e);
    }

    public Node addNew(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = addNew(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = addNew(node.right, e);
        }

        return node;
    }

    public void remove(E e){


    }

    public void contains(){

    }


}
