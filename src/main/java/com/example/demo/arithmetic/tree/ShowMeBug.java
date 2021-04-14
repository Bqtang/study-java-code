package com.example.demo.arithmetic.tree;
import java.util.*;

public class ShowMeBug {
     static class Node {
          int id;
          int parentId;
          String name;

          public Node(int id, int parentId, String name) {
               this.id = id;
               this.parentId = parentId;
               this.name = name;
          }
     }

     public static void main(String[] args) {
          List<Node> nodeList = Arrays.asList(new Node(1, 0, "AA"),
                    new Node(2, 1, "BB"), new Node(3, 1, "CC"),
                    new Node(4, 3, "DD"), new Node(5, 3, "EE"),
                    new Node(6, 2, "FF"), new Node(7, 2, "GG"),
                    new Node(8, 4, "HH"), new Node(9, 5, "II"),
                    new Node(10, 0, "JJ"), new Node(11, 10, "KK"),
                    new Node(12, 10, "LL"), new Node(13, 12, "MM"),
                    new Node(14, 13, "NN"), new Node(15, 14, "OO")
          );
          print(nodeList);
     }

     public static void print(List<Node> nodeList) {
          //先构建树
          Map<Integer, List<Node>> tree = new HashMap();
          for (Node node : nodeList) {
               Integer parentId = node.parentId;
               if (tree.containsKey(parentId)) {
                    tree.get(parentId).add(node);
               } else {
                    List<Node> children = new ArrayList<Node>();
                    children.add(node);
                    tree.put(parentId, children);
               }
          }

          //深度遍历tree
          ArrayList res = new ArrayList();
          dfs(tree, 0, res);

          System.out.println(res);

     }

     public static void dfs(Map<Integer, List<Node>> tree, Integer id, List<String> res) {
          if (!tree.containsKey(id)) {
               return;
          }

          for (Node node : tree.get(id)) {
               res.add(node.name);
               dfs(tree, node.id, res);
          }
     }
}