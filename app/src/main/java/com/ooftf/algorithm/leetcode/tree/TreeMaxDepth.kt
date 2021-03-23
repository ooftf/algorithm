package com.ooftf.algorithm.leetcode.tree

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/submissions/
 * 给定一个二叉树，找出其最大深度。
 *二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
object TreeMaxDepth {
    fun maxDepth(root: TreeNode?): Int {
        return traverse(0, root)
    }

    fun traverse(depth: Int, root: TreeNode?): Int {
        if (root == null) {
            return depth
        }
        val newDepth = depth + 1
        val left = traverse(newDepth, root.left)
        val right = traverse(newDepth, root.right)
        if (left > right) {
            return left
        } else {
            return right
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}