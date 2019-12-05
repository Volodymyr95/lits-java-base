package com.lits.oop.leeson21;

public class Lock {
    private boolean isLock = false;

    public synchronized void lock() throws InterruptedException {
        if (isLock) {
            wait();
        }
        isLock = true;
    }

    public synchronized void unlock () {
        isLock = false;
        notify();
    }
}
