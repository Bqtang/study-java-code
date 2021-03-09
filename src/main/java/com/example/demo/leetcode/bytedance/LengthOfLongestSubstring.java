package com.example.demo.leetcode.bytedance;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 3. 无重复字符的最长子串
 * @Auther: tangbingqun
 * @Date: 2021/2/23 8:54 AM
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */

public class LengthOfLongestSubstring {

     public int lengthOfLongestSubstring(String s) {
          if (s == null || s.length() == 0) {
               return 0;
          }
          Set<Character> chars = new HashSet<>();
          int front = 0;
          int back = 0;
          int max = 0;
          while (front < s.length()) {
               char currentChar = s.charAt(front);
               //没有重复的
               if (!chars.contains(currentChar)) {
                    chars.add(currentChar);
                    int tmpMax = front - back + 1;
                    if (tmpMax > max) {
                         max = tmpMax;
                    }
               } else {
                    //重复指针后指针向前移动
                    char backChar = s.charAt(back);
                    while (backChar != currentChar) {
                         chars.remove(backChar);
                         ++back;
                         backChar = s.charAt(back);
                    }
                    ++back;
               }
               ++front;
          }
          return max;
     }


}
