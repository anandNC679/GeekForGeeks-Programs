package com.thread;

/**
 * author anand.
 * since on 25/3/18.
 */
public class PrintEvenOddTester {

    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
        t1.start();
        t2.start();
    }

}

class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {

        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                try {
                    print.printEven(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                try {
                    print.printOdd(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // number+=2;
            }
            number += 2;
        }

    }

}

class Printer {

    boolean isOdd = false;

    synchronized void printEven(int number) throws InterruptedException {

        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(1000);
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) throws InterruptedException {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(1000);
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }

}