package com.lits.oop.leeson21;

public class Main {
    public static void main(String[] args) {
        MathOpperation math = new MathOpperation();
        Thread t1 = new ListsThread(math);

        t1.setPriority(10);

        t1.setName("Thread1");

        t1.start();


        Thread t2 = new Thread() {
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                for (int i = 200; i < 210; i++) {
                    try {
                        math.add(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.setName("Thread2");
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                for (int i = 300; i < 310; i++) {
                    try {
                        math.add(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t3.setName("Thread3");
        t3.start();
    }
}
