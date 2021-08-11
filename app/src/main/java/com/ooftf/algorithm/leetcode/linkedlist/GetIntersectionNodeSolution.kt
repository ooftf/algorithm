package com.ooftf.algorithm.leetcode.linkedlist

import com.ooftf.algorithm.leetcode.ListNode

/**
 *
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 *
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。

图示两个链表在节点 c1 开始相交：

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/intersection-of-two-linked-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class GetIntersectionNodeSolution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null
        var currentA = headA
        var currentB = headB
        var bool = true
        while (currentA != null) {
            if (currentA == currentB) {
                return currentA
            } else {
                currentA = if (currentA.next == null && bool) {
                    bool = false
                    headB
                } else {
                    currentA.next
                }
                currentB = currentB?.next ?: headA
            }
        }
        return null
    }
}