package com.ooftf.algorithm.leetcode

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
返回同样按升序排列的结果链表。
 *
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 *
 */
class DeleteDuplicatesSolution {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current != null) {
            if (current.`val` == current.next?.`val`) {
                current.next = current.next?.next
            }else{
                current = current.next
            }

        }
        return head
    }
}