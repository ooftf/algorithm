package com.ooftf.algorithm.leetcode

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
 *
 * https://leetcode-cn.com/problems/search-insert-position/submissions/
 */
class SearchInsertSolution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if(target<=nums[0]){
            return 0
        }
        (0 until nums.size - 1).forEach {
            if (nums[it] < target && target <= nums[it + 1]) {
                return it + 1
            }
        }
        return nums.size
    }
}