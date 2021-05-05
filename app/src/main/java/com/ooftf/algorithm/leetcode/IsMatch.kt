package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/regular-expression-matching/
 *
 * 动态规划
 *
 * 太难了，等等再做
 */
object IsMatch {

    // s = "aaa" p = "a*aaa"
    fun isMatch(s: String, p: String): Boolean {
        var i = 0
        var j = 0
        while ((i < s.length || j < p.length) && j < p.length) {
            if (j + 1 < p.length && p[j + 1] == '*') {
                if (match(s, p, i, j)) {
                    i++
                } else {
                    j += 2
                }
            } else {
                if (match(s, p, i, j)) {
                    j++
                    i++
                } else {
                    return false
                }
            }
        }
        return i == s.length
        //return true
    }

    fun match(s: String, p: String, i: Int, j: Int): Boolean {
        if (i >= s.length) {
            return false
        }
        return s[i] == p[j] || p[j] == '.'
    }

    @JvmStatic
    fun main(args: Array<String>) {
        isMatch("ab", ".*")
    }

}