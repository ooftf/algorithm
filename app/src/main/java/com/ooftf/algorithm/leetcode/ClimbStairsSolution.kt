package com.ooftf.algorithm.leetcode

class ClimbStairsSolution {
    fun climbStairs(n: Int): Int {
        var pre1 = 1
        var pre2 = 0
        (1..n).forEach{
            var current = pre1+pre2
            pre2 = pre1
            pre1 = current
        }

        return pre1
    }
}