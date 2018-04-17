package com.thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

/**
 * author anand.
 * since on 25/3/18.
 */
public class EvenOdd {
    public static void main(String args[]){

        AtomicLong num=new AtomicLong(1);
        Object lock=new Object();
        Even even=new Even(num,lock);
        Odd odd=new Odd(num,lock);
        even.start();
        odd.start();
    }
}

class Even extends Thread{
    private AtomicLong num;
    public Object lock;

    public Even(AtomicLong num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    public void run(){
        synchronized (lock){
            while (true && num.get()<=10){
                if(num.get()%2!=0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("even:"+num);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num.incrementAndGet();
                    lock.notifyAll();
                }
            }
        }
    }
}

class Odd extends Thread{
    private AtomicLong num;
    public Object lock;

    public Odd(AtomicLong num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    public void run()  {
        synchronized (lock){
            while (true && num.get()<=10){
                if(num.get()%2==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("odd:"+num);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num.incrementAndGet();
                    lock.notifyAll();
                }

            }
        }
    }
}