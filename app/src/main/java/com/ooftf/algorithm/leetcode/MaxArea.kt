package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 *
 * 不是最优解
 */
object MaxArea {
    fun maxArea(height: IntArray): Int {
        var result = 0
        for (i in height.indices) {
            if (height[i] != 0) {
                var start = (result / height[i]) + i + 1
                for (j in start until height.size) {
                    val area = (j - i) * (height[j].coerceAtMost(height[i]))
                    result = result.coerceAtLeast(area)
                }

            }
        }
        return result
    }

    fun maxArea2(height: IntArray): Int {
        var result = 0
        var i = 0
        var j = height.size - 1
        while (i < j) {
            val area = (j - i) * height[j].coerceAtMost(height[i])
            result = result.coerceAtLeast(area)
            if (height[j] < height[i]) {
                j--
            } else if (height[j] > height[i]) {
                i++
            } else {
                j--
                i++
            }
        }
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
    }
}