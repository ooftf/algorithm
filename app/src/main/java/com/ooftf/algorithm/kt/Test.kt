package com.ooftf.algorithm.kt

/**
 * 测试协变out  逆变in  的作用
 * @author ooftf
 * @email 994749769@qq.com
 * @date 2021/3/5
 */
class Test<in T : Parent> {

    companion object {
        var t: Test<Child>? = null

        init {
            t = Test<Parent>()
            //如何用协变 out  则可接受子类赋值、
            //如果用逆变 in   则可接受父类赋值
        }
    }
}

open class Parent {}
class Child : Parent() {}