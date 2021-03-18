package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 *
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
I 可以放在 V (5) 和 X (10) 的左边， IV  IX来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，XL XC来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，CD  CM来表示 400 和 900。


 */
object RomanToInt {
    fun romanToInt(s: String): Int {
        val kv = HashMap<String, Int>()
        kv["IV"] = 4
        kv["IX"] = 9
        kv["XL"] = 40
        kv["XC"] = 90
        kv["CD"] = 400
        kv["CM"] = 900
        kv["I"] = 1
        kv["V"] = 5
        kv["X"] = 10
        kv["L"] = 50
        kv["C"] = 100
        kv["D"] = 500
        kv["M"] = 1000

        var result = 0
        var i = 0
        while (i < s.length) {
            if (i + 1 < s.length) {
                val ss2 = s.substring(i, i + 2)
                val get = kv[ss2]
                if (get == null) {
                    result += kv[ss2[0].toString()] ?: 0
                    i++
                } else {
                    result += get
                    i += 2
                }
            } else {
                result += kv[s[i].toString()] ?: 0
                i++
            }
        }
        return result
    }
}