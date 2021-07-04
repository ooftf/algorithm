package com.ooftf.algorithm.leetcode

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
class MaxSum {
    //f(i)=max{f(i−1)+nums[i],nums[i]}
    // 递归解题
    var currentMax = Integer.MIN_VALUE
    fun maxSubArray(nums: IntArray): Int {
        var s = arrayValue(nums, nums.size - 1)
        currentMax = Math.max(currentMax, s)
        return currentMax
    }
    fun arrayValue(nums: IntArray, i: Int): Int {
        if (i == 0) {
            return nums[i]
        }
        val result = Math.max(nums[i], arrayValue(nums, i - 1) + nums[i])
        currentMax = Math.max(currentMax, result)
        return result
    }
    /** d
     * 动态规划
     *
     * 1. “最大和” 肯定以某个数为结尾，那么我们以每个数作为结尾分别求出最大和，取最大值【这一步的目的是将最大和问题，转换为一个遍历求各个最大和问题】
     * 2. 如果用 f(i) 表示以 i 为结尾的最大和，那么 f(i) = Max{f(i-1)+i,i}
     *
     */
    fun maxSubArray2(nums: IntArray): Int {
        var result: Int? = null
        var preMax: Int? = null// 以 i-1 作为结尾的最大和
        nums.forEachIndexed { index, i ->

            val iMax = preMax?.let {
                i.coerceAtLeast(it + i)
            } ?: i
            result = result?.let { it.coerceAtLeast(iMax) } ?: iMax
            preMax = iMax

        }

        return result ?: 0
    }



}