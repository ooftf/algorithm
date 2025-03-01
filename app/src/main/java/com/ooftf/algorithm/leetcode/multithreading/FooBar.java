package com.ooftf.algorithm.leetcode.multithreading;

/**
 * 两个不同的线程将会共用一个 FooBar 实例。其中一个线程将会调用 foo() 方法，另一个线程将会调用 bar() 方法。
 *
 * 请设计修改程序，以确保 "foobar" 被输出 n 次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/print-foobar-alternately
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
class FooBar {
    private int n;
    boolean foo = true;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if (!foo) {
                wait();
            }

            printFoo.run();
            foo = false;
            notify();
        }
    }

    public synchronized void  bar(Runnable printBar) throws InterruptedException {
        Thread.yield();
        for (int i = 0; i < n; i++) {
            if(foo){
               wait();
            }
            printBar.run();
            foo = true;
            notify();
        }
    }

}