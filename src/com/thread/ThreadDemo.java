package com.thread;

/**
 * author anand.
 * since on 23/3/18.
 */

class MyThread extends Thread{
    public void run(){
        for(int i=9;i<10000;i=i+9){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String args[]){
        MyThread myThread=new MyThread();
        myThread.start();
        for (int i=10;i<10000;i=i+10){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
