package com.example.demo.arithmetic.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 20. 括号匹配  "{[()]}"  栈处理有效的括号
 * @Auther: tangbingqun
 * @Date: 2020/5/7 6:00 PM
 */

public class ValidBracket {
     public Boolean isValidV2(String s) {
          int length = s.length();
          if (length % 2 == 1) {
               return Boolean.FALSE;
          }
          Map<Character, Character> pairs = new HashMap<Character, Character>() {{
               put(')', '(');
               put(']', '[');
               put('}', '{');
          }};

          Stack<Character> stack = new Stack<>();
          for (Character c : s.toCharArray()) {
               if (pairs.containsKey(c)) {
                    if (stack.isEmpty() || !stack.peek().equals(pairs.get(c))) {
                         return false;
                    }
               } else {
                    stack.push(c);
               }
          }

          return stack.isEmpty();
     }

     public static void main(String[] args) {
          boolean valid1 = new ValidBracket().isValidV2("()");
          System.out.println("获取相关的值：" + valid1);

          boolean valid2 = new ValidBracket().isValidV2("{}[()]");
          System.out.println("获取相关的值" + valid2);


     }
}
