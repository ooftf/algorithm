package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
object LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val result = StringBuilder()
        var index = 0
        if (strs.isEmpty()) {
            return ""
        }
        while (true) {
            val c: Char? = strs[0].getOrNull(index) ?: return result.toString()
            for (i in 1 until strs.size) {
                if (c != strs[i].getOrNull(index)) {
                    return result.toString()
                }
            }
            result.append(c)
            index++
        }
    }
}