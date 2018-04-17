package com.thread;

/**
 * author anand.
 * since on 8/4/18.
 */

class MyThread1 extends Thread{
    String name;

    MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(name+" : "+i);
           // yield();
        }
    }
}
public class YieldExampleWithThreadArray {

    public static void main(String args[]){
        Thread[] threads={new MyThread1("thread1"),
                new MyThread1("thread2"),
                new MyThread1("thread3")
        };

        for (Thread thread:threads){
            thread.start();
        }
    }


}
