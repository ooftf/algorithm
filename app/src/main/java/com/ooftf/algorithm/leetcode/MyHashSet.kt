package com.ooftf.algorithm.leetcode

import java.util.*

/**
 * https://leetcode-cn.com/problems/design-hashset/
 *
 * 不使用任何内建的哈希表库设计一个哈希集合（HashSet）。

实现 MyHashSet 类：

void add(key) 向哈希集合中插入值 key 。
bool contains(key) 返回哈希集合中是否存在这个值 key 。
void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/design-hashset
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class MyHashSet {
    /** Initialize your data structure here. */
    val size = 769
    var container = Array<LinkedList<Int>>(size) {
        LinkedList()
    }

    fun add(key: Int) {
        container[key % size].run {
            if (!contains(key))
                add(key)
        }
    }

    fun remove(key: Int) {
        container[key % size].run {
            remove(key)
        }
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean {
        container[key % size].run {
            return contains(key)
        }
    }
}