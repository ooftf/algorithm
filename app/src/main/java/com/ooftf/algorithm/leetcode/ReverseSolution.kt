package com.ooftf.algorithm.leetcode

import java.lang.Exception

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 */
class ReverseSolution {
    fun reverse(x: Int): Int {
        try {
            if (x < 0) {
                return -x.toString().let {
                    it.substring(1, it.length).reversed().toInt()
                }
            } else {
                return x.toString().reversed().toInt()
            }
        } catch (e: Exception) {
            return 0
        }


    }
}