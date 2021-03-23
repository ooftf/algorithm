package com.ooftf.algorithm.leetcode.tree

/**
 * https://leetcode-cn.com/problems/same-tree/
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
object IsSameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }

        if (p != null && q != null) {
            if (p.`val` == q.`val`) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
            } else {
                return false
            }
        }
        return false

    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}