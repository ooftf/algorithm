package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/palindrome-number/
 */
object IsPalindrome {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        val ca = x.toString()
        var start = 0
        var end = ca.length - 1
        while (start < end) {
            if (ca[start] != ca[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(isPalindrome(121))
    }
}