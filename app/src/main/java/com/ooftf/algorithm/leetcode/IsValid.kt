package com.ooftf.algorithm.leetcode

import java.util.*
import kotlin.collections.HashMap

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * https://leetcode-cn.com/problems/valid-parentheses/
 */

object IsValid {
    //'('，')'，'{'，'}'，'['，']'
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val map = HashMap<Char, Char>()
        map['('] = ')'
        map['{'] = '}'
        map['['] = ']'
        s.forEach {
            when (it) {
                '(', '{', '[' -> stack.push(it)
                else -> {
                    println("${stack.peek()}::${map[stack.peek()]}")
                    if(stack.size == 0){
                        return false
                    }
                    if (it == map[stack.peek()]) {
                        stack.pop()
                    } else {
                        return false
                    }
                }
            }
        }
        return stack.size == 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        isValid("()")
    }
}