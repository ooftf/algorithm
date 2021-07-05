package com.ooftf.algorithm.leetcode

import android.util.SparseArray
import android.util.SparseIntArray

class JumpSolution {
    fun jump(nums: IntArray): Int {
        val fn = ArrayList<Int>()
        fn.add(0)
        nums.forEachIndexed { index, i ->
            if(index == nums.size-1){
                return fn[index]
            }
            val minPre = fn[index]
            val reachable = minPre+1
            (index+1..index+i).forEach {
                if(it>= fn.size){
                    fn.add(reachable)
                }else{
                    fn[it] = fn[it].coerceAtMost(reachable)
                }
                if(it == nums.size-1){
                    return fn[nums.size-1]
                }

            }
        }
        return fn[nums.size-1]
    }
}