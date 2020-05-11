package com.example.demo.arithmetic.stack;

import java.util.Stack;

/**
 * @Description: 括号匹配  "{[()]}"  栈处理有效的括号
 * @Auther: tangbingqun
 * @Date: 2020/5/7 6:00 PM
 */

public class ValidBracket {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }

                char topChar = stack.pop();
                if (c ==')' && topChar != '('){
                    return false;
                }

                if (c ==']' && topChar != '['){
                    return false;
                }

                if (c=='}' && topChar != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        boolean valid1 = new ValidBracket().isValid("{[()]}");
        System.out.println("获取相关的值："+ valid1);

        boolean valid2 = new ValidBracket().isValid("{}[]()");
        System.out.println("获取相关的值"+ valid2);



    }
}
