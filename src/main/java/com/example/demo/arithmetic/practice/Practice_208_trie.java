package com.example.demo.arithmetic.practice;

import java.util.TreeMap;

/**
 * @Author: 字典数相关的基础
 * @DateTime: 2020/6/21 8:46 PM
 * @Description: 实现 Trie (前缀树)
 *
 * 题目：
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 *
 * 示例:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 *
 *
 * 说明:
 *
 * 你可以假设所有的输入都是由小写字母 a-z 构成的。
 * 保证所有输入均为非空字符串。
 *
 */
public class Practice_208_trie {

    private class Node{
        private boolean isWord;
        private TreeMap<Character,Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new TreeMap<>();
        }
        public Node(){
            this(false);

        }
    }

    private Node  root;
    private int size;

    public Practice_208_trie(){
        root = new Node();
        size = 0;
    }

    public void  insert(String word){
        Node cur = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(cur.next.get(c) == null){
                cur.next.put(c,new Node());
            }
            cur = cur.next.get(c);
        }
        if (!cur.isWord){
            cur.isWord = true;
            size ++;
        }
    }


    public boolean search(String word){
        Node cur = root;
        for(int i = 0; i < word.length(); i++){
            char c =word.charAt(i);
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        return cur.isWord;
    }


    public boolean  prefix(String prefix){
        Node cur = root;
        for(int i = 0; i < prefix.length(); i++){
            char  c = prefix.charAt(i);
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        return true;
    }

    public static void main(String[] args) {
        Practice_208_trie practice208 = new Practice_208_trie();
        practice208.insert("apple");
        boolean apple = practice208.search("apple");
        System.out.println("1.apple:--->" + apple);
        boolean app = practice208.search("app");
        System.out.println("2.app:--->"+ app);
        boolean prefix = practice208.prefix("app");
        System.out.println("3.prefix:--->" + prefix);
        practice208.insert("app");
        boolean app1 = practice208.search("app");
        System.out.println("4.app1:--->" + app1);


    }


}
