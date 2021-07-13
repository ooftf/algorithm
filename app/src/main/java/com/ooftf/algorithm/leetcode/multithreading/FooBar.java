package com.ooftf.algorithm.leetcode.multithreading;

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