package com.lits.oop.leeson21;

public class MathOpperation {
    private int i = 0;
    private Lock lock;

    public MathOpperation() {
        lock = new Lock();
    }

    public void add(Integer j) throws InterruptedException {
        lock.lock();
        Thread t = Thread.currentThread();
        Integer b = j;
        System.out.println("Thread name : " + t.getName());
        System.out.println("first " + b);
        System.out.println("Thread name : " + t.getName());
        System.out.println("second " + b);
        i += b;
        lock.unlock();
    }
}
