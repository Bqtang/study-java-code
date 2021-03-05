package com.example.demo.leetcode.bytedance;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: tbq
 * @DateTime: 2020/12/27 10:20 PM
 * @Description:  20 题目：有效括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class IsValidBracket_20 {

    public boolean isValid(String s) {
        int len = s.length();

        //不是偶数直接返回
        if (len % 2 == 1) {
            return false;
        };

        Map<Character, Character> pairs = new HashMap(3) {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(c)) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }



    /**
     * 有效括号
     * 时间复杂度： O(n)
     * 空间复杂度: O(n)
     * @param s
     * @return
     */
    public static boolean isValid_1(String s){
        if (s == null) {
            return true;
        }
        Stack<Character>  stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == ' '){
                continue;
            }

            if (c == '(' || c == '{' || c == '['){
                stack.push(c);

            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char topElement = stack.pop();
                char matched = '#';

                if (c == ')'){
                    matched = '(';
                } else if(c == '}'){
                    matched = '{';
                }else{
                    matched = '[';
                }

                if (topElement  !=  matched){
                    return  false;
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String  s = "{[]}";
        boolean valid_1 = isValid_1(s);
        System.out.println(valid_1);

    }
}
