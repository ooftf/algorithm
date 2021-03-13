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
        sort(data, 0, data.size - 1)
        println("result::${data.contentToString()}")
    }

    /**
     * 从两侧遍历找
     */
    fun sort(args: Array<Int>, startIndex: Int, endIndex: Int) {
        if (startIndex >= endIndex) {
            return
        }


        var right = endIndex
        var left = startIndex
        while (left < right) {
            while (left < right && args[right] >= args[startIndex]) {
                right--
            }

            while (left < right && args[left] <= args[startIndex]) {
                left++
            }
            if (left < right) {
                val temp = args[left]
                args[left] = args[right]
                args[right] = temp
            }
        }

        val temp = args[left]
        args[left] = args[startIndex]
        args[startIndex] = temp

        println(args)
        sort(args, startIndex, left - 1)
        sort(args, left + 1, endIndex)


    }
}

