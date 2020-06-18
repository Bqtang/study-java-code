package com.example.demo.arithmetic.trie;

import java.util.TreeMap;

/**
 * @Description: 字典树
 * @Auther: tangbingqun
 * @Date: 2020/6/17 5:45 PM
 */

public class Trie {

    private class Node{
        boolean  isWord;
        TreeMap<Character, Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node(){
            this(false);
        }
    }

    private Node root;
    private int size;

    public Trie(){
        root = new Node();
        size = 0;
    }

    public int getSize(){
        return size;
    }

    //向trie 中添加一个新的单词
    public void  add(String word){
        Node  cur = root;
        for (int i = 0; i < word.length(); i++){
            char  c = word.charAt(i);
            if (cur.next.get(c) == null){
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }

        if (!cur.isWord){
            cur.isWord = true;
            size ++;
        }
    }

    //查询单词Word是否在Trie 中
    public boolean contains(String word){
        Node cur = root;
        for(int i = 0; i < word.length(); i ++){
            char c = word.charAt(i);
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        return cur.isWord;
    }

}
