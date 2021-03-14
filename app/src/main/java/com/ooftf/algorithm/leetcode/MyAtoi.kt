package com.ooftf.algorithm.leetcode

import java.lang.NumberFormatException
import java.lang.StringBuilder

/**
 * https://leetcode-cn.com/problems/string-to-integer-atoi/
 */
object MyAtoi {
    fun myAtoi(s: String): Int {
        val result = StringBuilder()
        run outside@{
            s.trim().toCharArray().forEachIndexed { index, it ->

                if (index != 0 && (it == '+' || it == '-')) {
                    return@outside
                }
                when (it) {
                    '-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+' -> {
                        result.append(it)
                    }
                    else -> {
                        return@outside
                    }
                }
            }
        }
        try {
            return result.toString().toInt()
        } catch (e: NumberFormatException) {
            if (result.length <= 1) {
                return 0
            } else {
                return if (result.startsWith('-')) {
                    Int.MIN_VALUE
                } else {
                    Int.MAX_VALUE
                }
            }

        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        print(myAtoi("-91283472332"))

    }

}