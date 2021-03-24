package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
object RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var s = 0
        var end = nums.size
        var current = 0
        while (current < end) {
            if (current == 0) {
                s++
                current++
            } else if (nums[current - 1] != nums[current]) {
                current++
                s++
            } else {
                var n = current
                while (n < end - 1) {
                    nums[n] = nums[n + 1]
                    n++
                }
                end--
            }
        }

        return s
    }

    fun removeDuplicates2(nums: IntArray): Int {
        var right = 1
        var left = 0
        while (right < nums.size) {
            if (nums[right] > nums[left]) {
                left++
                if (left != right) {
                    nums[left] = nums[right]

                }
            }
            right++
        }

        return left+1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        removeDuplicates(intArrayOf(1, 1, 2))
    }
}