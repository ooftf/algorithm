package com.ooftf.algorithm.leetcode.multithreading;

/**
 *
 * 三个不同的线程 A、B、C 将会共用一个 Foo 实例。
 *
 * 一个将会调用 first() 方法
 * 一个将会调用 second() 方法
 * 还有一个将会调用 third() 方法
 * 请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/print-in-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * https://leetcode-cn.com/problems/print-in-order/solution/si-chong-bu-tong-de-shi-xian-fang-shi-zong-jie-by-/
 */
public class Foo {
    int state = 1;

    public Foo() {

    }

    public synchronized void  first(Runnable printFirst) throws InterruptedException {
        while(state != 1){
            wait();
        }
// printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        state++;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(state != 2){
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        state++;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(state != 3){
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        state++;
        notifyAll();
    }
}
