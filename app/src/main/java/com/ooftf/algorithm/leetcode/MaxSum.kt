package com.ooftf.algorithm.leetcode

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
class MaxSum {
    //f(i)=max{f(i−1)+nums[i],nums[i]}
    var currentMax = Integer.MIN_VALUE
    fun maxSubArray(nums: IntArray): Int {

        var s = arrayValue(nums,nums.size-1)
        currentMax = Math.max(currentMax,s)
        return currentMax
    }

    fun arrayValue(nums: IntArray, i:Int):Int {
        if (i == 0) {
            return nums[i]
        }
        val result = Math.max(nums[i], arrayValue(nums, i - 1) + nums[i])
        currentMax = Math.max(currentMax,result)
        return result
    }
}