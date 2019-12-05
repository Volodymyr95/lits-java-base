package com.lits.oop.leeson21;

public class ListsThread extends Thread {

    private MathOpperation math;

    public ListsThread(MathOpperation math) {
        this.math = math;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 100; i < 110; i++) {
            try {
                math.add(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
