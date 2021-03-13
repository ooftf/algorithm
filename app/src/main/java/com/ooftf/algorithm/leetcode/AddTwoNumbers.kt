package com.ooftf.algorithm.leetcode

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode? {
        var first: ListNode? = l1
        var second: ListNode? = l2
        var current: ListNode? = null
        var jinWei = 0
        var header: ListNode? = null
        do {
            var temp = 0
            if (first != null) {
                temp += first.`val`
            }
            if (second != null) {
                temp += second.`val`
            }
            temp += jinWei
            jinWei = temp / 10
            if (current == null) {
                header = ListNode(temp % 10)
                current = header
            } else {
                current.next = ListNode(temp % 10)
                current = current.next
            }
            first = first?.next
            second = second?.next
        } while (first != null || second != null)
        if (jinWei > 0) {
            current?.next = ListNode(jinWei)
        }
        return header
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

