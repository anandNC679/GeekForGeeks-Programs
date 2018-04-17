package com.thread;

/**
 * author anand.
 * since on 11/4/18.
 */

public class DeadlockCreationAndSolution {

    public static void main(String args[]){
        DeadlockCreationAndSolution obj=new DeadlockCreationAndSolution();
        final A a=obj.new A();
        final B b=obj.new B();

        Runnable r1=new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("In Block 1 b");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (a){
                        System.out.println("In Block 1 a");
                    }
                }

            }
        };

        Runnable r2=new Runnable() {
            @Override
            public void run() {
               synchronized (b){
                   System.out.println("In Block 2 b");
                   synchronized (a){
                       System.out.println("In Block 2 a");
                   }
               }

            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

    class A{
        int num=10;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    class B{
        int num=20;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
