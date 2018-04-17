package com.thread;

/**
 * author anand.
 * since on 8/4/18.
 */

class CounterHandler{

    public static int counter=0;
    public  static synchronized void counterIncrement(){
        ++counter;
        System.out.println("count is "+counter+" @ III");
    }
    public  static synchronized void counterDecrement(){
        --counter;
        System.out.println("count is "+counter+" @ DDD");
    }

}
public class SycronizationCounter {
    public static void main(String args[]){

        Thread threadIncrement=new Thread(){
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    CounterHandler.counterIncrement();
                }
            }
        };

        Thread threadDecrement=new Thread(){

            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    CounterHandler.counterDecrement();
                }
            }
        };

        threadDecrement.start();
        threadIncrement.start();
    }
}
