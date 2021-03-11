package com.ooftf.algorithm.leetcode;

import android.util.Log;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/submissions/
 */
public class LongestPalindromeSolution {
    /**
     * babad
     * aaaa
     * bb
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; i + j < s.length() && i - j >= 0; j++) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    if ((2 * j + 1) > result.length()) {
                        System.err.println("i::"+i+"j::"+j);
                        result = s.substring(i - j, i + j + 1);
                    }
                }else {
                    break;
                }
            }
            for (int j = 0; i + j - 1 >= 0 && i + j - 1 < s.length() && i - j >= 0 && i - j < s.length(); j++) {
                if (s.charAt(i - j) == s.charAt(i + j - 1)) {
                    if (2 * j > result.length()) {
                        System.err.println("-i::"+i+"j::"+j);
                        result = s.substring(i - j, i + j);
                    }
                } else {
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.err.println("mian::" + longestPalindrome("bacabab"));

    }
}
