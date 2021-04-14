package com.example.demo.arithmetic.skiplist;

/**
 * @description: 跳表
 * @author: tangbingqun
 * @Date: 2021/4/13 6:23 下午
 */
public class SkipList <E extends  Comparable> {

    private static final int MAX_LEVEL = 16;

    private class Node<E> {
        E data;

        Node[] nextNodes;

        int maxIndexLevel = 0;

        Node(E data){
            this.data = data;
            nextNodes = new Node[MAX_LEVEL];
        }
    }

    /**
     * 表示跳表的最大高度
     */
    private  int levelCount;

    /**
     * 虚拟头节点
     */
    private Node dummyHead;

    public SkipList(){
        this.levelCount = 1;
        this.dummyHead = new Node(-1);
    }

    public Node get(E e){
        Node  curr = dummyHead;

        //从最高层一层往下一层的寻找查找元素所在的区间
        for(int i = levelCount - 1; i >= 0; i --){

        }

        return null;

    }


}
