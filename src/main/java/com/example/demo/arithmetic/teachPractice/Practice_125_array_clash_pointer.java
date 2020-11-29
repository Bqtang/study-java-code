package com.example.demo.arithmetic.teachPractice;

/**
 * @Description: 对撞指针
 * @Auther: tangbingqun
 * @Date: 2020/7/5 10:59 AM
 *
 * 验证回文串：
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 输入: "race a car"
 * 输出: false
 *

 *
 */

public class Practice_125_array_clash_pointer {
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;
        while (l <= r){
            if (s.charAt(l)  != s.charAt(r)){
                return false;
            }
            l ++;
            r --;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "abc 4cba";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);

    }
}
