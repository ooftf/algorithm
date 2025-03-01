package com.ooftf.algorithm.leetcode

/**
 *
 *
 * https://leetcode-cn.com/problems/min-stack/
 *
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) —— 将元素 x 推入栈中。
pop() —— 删除栈顶的元素。
top() —— 获取栈顶元素。
getMin() —— 检索栈中的最小元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/min-stack
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class MinStack() {
    var head: Node? = null


    /** initialize your data structure here. */
    class Node(var next: Node?, var value: Int,var min: Int)

    fun push(`val`: Int) {
        var newNode = Node(head, `val`,head?.min?.coerceAtMost(`val`)?:`val`)
        head = newNode
    }

    fun pop() {
        head = head?.next
    }

    fun top(): Int {
        return head?.value ?: 0
    }

    fun getMin(): Int {
        return head?.min?:0
    }

}
