package com.ooftf.algorithm.leetcode

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/submissions/
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
object MergeTwoLists {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var first = l1
        var second = l2
        var current: ListNode? = null
        var result: ListNode? = null
        while (first != null || second != null) {
            while (second != null) {
                if (first == null || second.`val` <= first.`val`) {
                    if (current == null) {
                        current = second
                        result = current
                    } else {
                        current.next = second
                        current = current.next
                    }
                    second = second.next
                } else {
                    break
                }
            }
            while (first != null) {
                if (second == null || second.`val` >= first.`val`) {
                    if (current == null) {
                        current = first
                        result = current
                    } else {
                        current.next = first
                        current = current.next
                    }
                    first = first.next
                } else {
                    break
                }

            }

        }
        return result
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

