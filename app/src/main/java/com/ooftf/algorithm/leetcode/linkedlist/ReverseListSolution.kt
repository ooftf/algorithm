package com.ooftf.algorithm.leetcode.linkedlist

import com.ooftf.algorithm.leetcode.ListNode

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 *
 */
class ReverseListSolution {
    /**
     * 迭代实现
     *
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     */
    fun reverseList(head: ListNode?): ListNode? {
        var newHead: ListNode? = null
        var oldHead = head
        while (oldHead != null) {
            var next = oldHead.next
            oldHead.next = newHead
            newHead = oldHead
            oldHead = next
        }
        return newHead
    }

    /**
     *  递归实现
     */
    fun reverseList2(head: ListNode?): ListNode? {
        if(head?.next == null){
            return head
        }
        val newHead = reverseList2(head.next!!)
        head.next!!.next = head
        head.next = null
        return newHead
    }
}