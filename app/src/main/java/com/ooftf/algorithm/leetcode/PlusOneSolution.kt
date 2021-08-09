package com.ooftf.algorithm.leetcode

/**
 *
 * https://leetcode-cn.com/problems/plus-one/
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/plus-one
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class PlusOneSolution {
    fun plusOne(digits: IntArray): IntArray {
        if (add(digits, digits.size - 1)) {
            val result = IntArray(digits.size + 1)
            result[0]=1
            return result
        }

        return digits
    }

    fun add(digits: IntArray, flag: Int): Boolean {
        if (flag < 0) {
            return true
        }
        val num = digits[flag] + 1
        if (num < 10) {
            digits[flag] = num
            return false
        } else {
            digits[flag] = 0
            return add(digits, flag - 1)
        }
    }
}