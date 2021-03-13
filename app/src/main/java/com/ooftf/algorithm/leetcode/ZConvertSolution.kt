package com.ooftf.algorithm.leetcode

import java.util.*

/**
 * https://leetcode-cn.com/problems/zigzag-conversion/
 */
class ZConvertSolution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }
        var resultArray = Array<LinkedList<Char>>(numRows) {
            LinkedList()
        }
        var flag = true
        var i = 0
        s.toCharArray().forEach { item ->
            resultArray[i].add(item)

            if (flag) {
                i++
                if (i == (numRows - 1)) {
                    flag = false
                }
            } else {
                i--
                if (i == 0) {
                    flag = true
                }
            }
        }
        val result = StringBuilder()
        resultArray.forEach {
            it.forEach {
                result.append(it)
            }
        }
        return result.toString()
    }
}