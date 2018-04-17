package com.thread;

/**
 * author anand.
 * since on 11/4/18.
 */

class ThreadB extends Thread{
    int total=0;
    @Override
    public void run()   {
        for(int i=0;i<100;i++){
            total+=i;
        }
        try {
            notify();
        }catch (IllegalMonitorStateException e){
            System.err.println(e);
        }
    }
}
public class WaitAndNotifyExample {
    public static void main(String args[]){
        ThreadB threadB=new ThreadB();

        threadB.start();
        synchronized (threadB){
            try {
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("total sum = "+threadB.total);
        }
    }
}
