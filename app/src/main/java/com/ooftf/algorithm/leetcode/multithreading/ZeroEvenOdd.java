package com.ooftf.algorithm.leetcode.multithreading;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 相同的一个 ZeroEvenOdd 类实例将会传递给三个不同的线程：
 *
 * 线程 A 将调用 zero()，它只输出 0 。
 * 线程 B 将调用 even()，它只输出偶数。
 * 线程 C 将调用 odd()，它只输出奇数。
 * 每个线程都有一个 printNumber 方法来输出一个整数。请修改给出的代码以输出整数序列 010203040506... ，其中序列的长度必须为 2n。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/print-zero-even-odd
 */
class ZeroEvenOdd {
    private int n;
    private int i = 1;
    private  Semaphore s0 = new Semaphore(1);
    private  Semaphore s1 = new Semaphore(0);
    private  Semaphore s2 = new Semaphore(0);
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(i<=n){
            s0.acquire();
            if(i<=n){
                printNumber.accept(0);
            }
            if(i%2 == 0 ){
                s2.release();
            }else{
                s1.release();
            }

        }

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void even(IntConsumer printNumber) throws InterruptedException {
        while(i<=n){
            s2.acquire();
            if(i<=n){
                printNumber.accept(i);
            }
            i++;
            s0.release();
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void odd(IntConsumer printNumber) throws InterruptedException {
        while(i<=n){
            s1.acquire();
            if(i<=n){
                printNumber.accept(i);
            }
            i++;
            s0.release();
        }
    }
}
