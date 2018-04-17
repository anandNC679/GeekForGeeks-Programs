package com.thread;

/**
 * author anand.
 * since on 11/4/18.
 */
public class DeadlockCondition {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("infinite loop start");
        Thread.currentThread().join();
        System.out.println("infinite loop end ");

    }

    /* * This method request two locks, first String and then Integer */
    public void method1() {
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");
            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            } } }
            /* * This method also requests same two lock but in exactly * Opposite order i.e. first Integer and then String. * This creates potential deadlock, if one thread holds String lock * and other holds Integer lock and they wait for each other, forever. */
            public void method2() {
                synchronized (Integer.class) {
                    System.out.println("Aquired lock on Integer.class object");
                    synchronized (String.class) {
                        System.out.println("Aquired lock on String.class object");
                    } } }

}
