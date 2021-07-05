package com.ooftf.algorithm.leetcode

import android.util.SparseArray
import java.util.*
import kotlin.collections.LinkedHashSet

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 括号问题的关键是，每个成对出现的括号，必须先写左括号
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
class GenerateParenthesis {
    val result = ArrayList<String>()
    fun generateParenthesis(n: Int): List<String> {
        generateParenthesis("",n,n)
        return result
    }

    fun generateParenthesis(current: String, left: Int, right: Int) {
        if(left == 0 && right ==0){
            result.add(current)
            return
        }
        if(left == right){
            generateParenthesis("$current(",left-1,right)
        }else if(right>left){
            generateParenthesis("$current)",left,right-1)
            if(left>0){
                generateParenthesis("$current(",left-1,right)
            }
        }
    }
}