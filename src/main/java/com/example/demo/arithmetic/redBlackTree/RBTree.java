package com.example.demo.arithmetic.redBlackTree;

/**
 * @Description:  红黑树
 * @Auther: tangbingqun
 * @Date: 2020/6/29 8:20 AM
 */

public class RBTree<K extends Comparable<K>, V> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private class Node {
        public K key;
        public V value;
        public Node left, right;
        public boolean color;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            color = RED;
        }
    }
    private Node root;
    private int size;

    //判断节点的颜色
    private boolean isRed(Node node) {
        if (node == null) {
            return BLACK;
        }
        return node.color;
    }
    //向红黑树中添加新元素
    public void add(K key, V value) {
        root = add(root, key, value);
        root.color = BLACK;  //根节点默认为黑色
    }
    //核心代码
    private Node add(Node node, K key, V value) {
        //添加根节点
        if (node == null) {
            size++;
            return new Node(key, value);
        }
        if (key.compareTo(node.key) < 0) {
            node.left = add(node.left, key, value);
        } else if (key.compareTo(node.key) > 0) {
            node.right = add(node.right, key, value);
        } else {
            node.value = value;
        }

        if (isRed(node.right) && !isRed(node.left)) {
            //左旋转
            node = leftRotate(node);
        }

        if (isRed(node.left) && isRed(node.left.left)) {
            //右旋转
            node = rightRotate(node);
        }

        if (isRed(node.left) && isRed(node.right)) {
            //颜色翻转
            flipColors(node);
        }
        return node;
    }
    //    node               x
    //    / \               /  \
    //   T1  x   --->    note   T3
    //      / \           / \
    //      T2 T3        T1  T2
    //左旋转的过程
    private Node leftRotate(Node node) {
        Node x = node.right;
        //左旋转
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }
    //       node              y
    //       / \              / \
    //      y   T3   --->    T1  node
    //     /\                     / \
    //    T1 T2                  T2  T3

    //右旋转的过程
    private Node rightRotate(Node node) {
        Node  y = node.left;
        node.left = y.right;
        y.right = node;
        y.color = node.color;
        node.color = RED;
        return y;
    }

    //颜色翻转
    private void flipColors(Node node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }
}
