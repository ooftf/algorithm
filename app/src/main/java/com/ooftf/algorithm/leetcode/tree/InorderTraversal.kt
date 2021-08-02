package com.ooftf.algorithm.leetcode.tree

import java.util.*

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
class InorderTraversal {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = ArrayList<Int>()
        doTraversal(root, result)
        return result
    }

    fun doTraversal(root: TreeNode?, result: ArrayList<Int>) {
        if (root == null) {
            return;
        }
        doTraversal(root.left, result)
        result.add(root.`val`)
        doTraversal(root.right, result)
    }

}



