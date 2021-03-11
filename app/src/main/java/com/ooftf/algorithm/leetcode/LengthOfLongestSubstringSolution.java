package com.ooftf.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstringSolution {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> map = new HashSet<>();
        for (int i = 0, j = 0; i < s.length() && j < s.length() && i + result < s.length(); ) {
            char c = s.charAt(j);
            if (map.contains(c)) {
                map.remove(s.charAt(i));
                i++;
            } else {
                map.add(c);
                int size = map.size();
                if (size > result) {
                    result = size;
                }
                j++;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
