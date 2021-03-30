package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/implement-strstr/
 *
 * 实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/implement-strstr
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class StrStr {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }

        for (i in 0 .. haystack.length - needle.length) {
            for (j in needle.indices) {
                if (needle[j] == haystack[i + j]) {
                    if (j == needle.length - 1) {

                        return i
                    }
                } else {
                    break
                }
            }

        }
        return -1
    }
}