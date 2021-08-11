package com.ooftf.algorithm.leetcode.tree

/**
 *
 * https://leetcode-cn.com/problems/symmetric-tree/
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 */
class IsSymmetricSolution {
    fun isSymmetric(root: TreeNode): Boolean {
        return traverseCheck(root.left,root.right)
    }

    fun traverseCheck(left: TreeNode?,right: TreeNode?):Boolean {
        if (left == null&& right == null) {
            return true
        }
        if(left == null||right == null ){
            return false
        }
        return left.`val` == right.`val`&& traverseCheck(left.left, right.right)&& traverseCheck(left.right, right.left)
    }
}