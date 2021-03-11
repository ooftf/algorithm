package com.ooftf.algorithm.burst

object VolatileTest {
    //@Volatile
    var value = true
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val t1 = object : Thread() {
            override fun run() {
                System.err.println("start")
                while (value) {
                    // System.err.println("value"+value);// TODO 添加这句打印也可以解决 不懂！！！
                }
                System.err.println("end") //TODO 这里是不走的  添加volatile可以解决
            }
        }.apply {
            start()
        }
        Thread.sleep(2000)
        val t2 = object : Thread() {
            override fun run() {
                System.err.println("2 start")
                value = false
                System.err.println("2 end")
            }
        }.apply {
            start()
        }
        t1.join()
        t2.join()
    }
}