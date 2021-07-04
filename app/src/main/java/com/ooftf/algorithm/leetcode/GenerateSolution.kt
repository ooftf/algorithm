package com.ooftf.algorithm.leetcode

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * https://leetcode-cn.com/problems/pascals-triangle/
 */
class GenerateSolution {
    fun generate(numRows: Int): List<List<Int>> {
        val result: ArrayList<List<Int>> = ArrayList();
        (0 until numRows).forEach {
            val row = ArrayList<Int>()
            if (it == 0) {
                row.add(1)
            } else {
                val pre = result[it - 1]

                (0 .. it).forEach {
                    val leftValue = if (it - 1 < 0) {
                        0
                    } else {
                        pre[it - 1]
                    }
                    val rightValue = if (it == pre.size) {
                        0
                    } else {
                        pre[it]
                    }
                    row.add(leftValue + rightValue)
                }

            }
            result.add(row)
        }
        return result
    }
}