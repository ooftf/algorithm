package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/length-of-last-word/
 *
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。

单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
class LengthOfLastWordSolution {

    fun lengthOfLastWord(s: String): Int {
        var i = s.length - 1
        var end: Int? = null
        while (i >= 0) {
            if (s[i] == ' ') {
                if (end != null) {
                    return end - i
                }

            } else {
                if (end == null) {
                    end = i
                }
            }

            i--
        }
        if (end != null) {
            return end - i
        }
        return 0
    }
}