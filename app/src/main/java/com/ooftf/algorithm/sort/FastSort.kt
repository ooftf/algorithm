package com.ooftf.algorithm.sort

import android.util.Log

/**
 * 快速排序，从两侧遍历找
 */
object FastSort {
    @JvmStatic
    fun main(args: Array<String>) {
        val data =
            arrayOf(
                9,
                9,
                9,
                9,
                9,
                9,
                9,
                9,
                99,
                9,
                1,
                9,
                9,
                9,
                99,
                9,
                9
            )//1.3.2  left 1  right =1
        doSort(data, 0, data.size - 1)
        println("result::${data.contentToString()}")
    }

    fun doSort(array: Array<Int>, start: Int, end: Int) {
        if (start >= end) {
            return
        }
        var left = start
        var right = end
        var leftAnchor = true
        while (left < right) {
            if (array[right] < array[left]) {
                val temp = array[left]
                array[left] = array[right]
                array[right] = temp
                leftAnchor = !leftAnchor
            } else {
                if (leftAnchor) {
                    right--
                } else {
                    left++
                }
            }
        }
        doSort(array,start,left-1)
        doSort(array,left+1,end)
    }
}

