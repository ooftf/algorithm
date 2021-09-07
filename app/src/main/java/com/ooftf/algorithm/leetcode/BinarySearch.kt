package com.ooftf.algorithm.leetcode

/**
 * 二分搜索算法
 */
class BinarySearch {
    fun search(array:IntArray,key:Int):Int{
        var low = 0
        var high = array.size-1
        while(low<high){
            var mid = Math.floor((low+high)/2.0).toInt()
            if(key == array[mid]){
                return array[mid]
            }else if(key < array[mid]){
                high = mid+1
            }else{
                low = mid-1
            }
        }
        return 0
    }
}