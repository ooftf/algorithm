package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/integer-to-roman/
 */
object IntToRoman {

    fun intToRoman(num: Int): String {
        val result = StringBuilder()
        val kv = LinkedHashMap<String, Int>()
        kv["M"] = 1000
        kv["CM"] = 900
        kv["D"] = 500
        kv["CD"] = 400
        kv["C"] = 100
        kv["XC"] = 90
        kv["L"] = 50
        kv["XL"] = 40
        kv["X"] = 10
        kv["IX"] = 9
        kv["V"] = 5
        kv["IV"] = 4
        kv["I"] = 1
        var temp = num
        kv.forEach {
            val i = temp / it.value
            for (j in 0 until i) {
                result.append(it.key)
            }
            temp %= it.value
            if(temp == 0){
                return result.toString()
            }
        }
        return result.toString()
    }
}