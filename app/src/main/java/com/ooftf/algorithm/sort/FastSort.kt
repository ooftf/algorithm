package com.ooftf.algorithm.sort

import android.util.Log

object FastSort {
    @JvmStatic
    fun main(args: Array<String>) {
        val data =
            arrayOf(9, 1, 48, 64, 1, 3, 15, 64, 8, 1, 65, 4, 8, 45, 6, 4)//1.3.2  left 1  right =1
        sort(data, 0, data.size - 1)
        println(data.contentToString())
    }

    fun sort(args: Array<Int>, startIndex: Int, endIndex: Int) {
        if (startIndex >= endIndex) {
            return
        }
        var baseIndex = startIndex
        val base = args[startIndex]
        var right = endIndex
        while (baseIndex < right) {
            val item = args[baseIndex + 1]
            if (item < base) {
                val temp = args[baseIndex + 1]
                args[baseIndex + 1] = args[baseIndex]
                args[baseIndex] = temp
                baseIndex++
            } else {
                val temp = args[baseIndex + 1]
                args[baseIndex + 1] = args[right]
                args[right] = temp
                right--
            }
        }
        println("left:$base : $startIndex : $base :${args.contentToString()}")
        println("right:$base : $base : $endIndex :${args.contentToString()}")
        sort(args, startIndex, baseIndex - 1)
        sort(args, baseIndex + 1, endIndex)
    }
}