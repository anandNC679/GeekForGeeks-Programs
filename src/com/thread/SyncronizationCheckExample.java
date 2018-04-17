package com.thread;

/**
 * author anand.
 * since on 17/4/18.
 */
class A{

    public synchronized void printThread(int n) {
        Thread t=Thread.currentThread();
        for (int i=1;i<=5;i++){
            System.out.println(t.getName()+" "+(i+n));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{

    A a=new A();
    public void run(){
        a.printThread(100);
    }
}
public class SyncronizationCheckExample {

    public static void main(String args[]){
        B b=new B();
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        t1.setName("Thread 1: ");
        t2.setName("Thread 2: ");

        t1.start();
        t2.start();
    }
}
