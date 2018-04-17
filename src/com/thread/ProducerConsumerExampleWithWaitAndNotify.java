package com.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * author anand.
 * since on 11/4/18.
 */
class Producer extends Thread{
    List<Integer> taskQueue=new ArrayList<>();
    int MaxSize;

    public Producer(List<Integer> taskQueue, int maxSize) {
        this.taskQueue = taskQueue;
        this.MaxSize = maxSize;
    }

    @Override
    public void run() {
        int counter=0;
        while (true){
            try {
                produce(counter++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void produce(int i) throws InterruptedException {
        synchronized (taskQueue){
            while (taskQueue.size()==MaxSize){
                    System.out.println("Queue is full " +
                            Thread.currentThread().getName() +
                            " is waiting , size: " + taskQueue.size());
                    taskQueue.wait();
            }
            Thread.sleep(1000);
            taskQueue.add(i);
            System.out.println("produced: "+i);
            taskQueue.notifyAll();
        }
    }
}
class Consumer1 extends Thread{
    List<Integer> taskQueue=new ArrayList<>();

    public Consumer1(List<Integer> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {

        try{
            while (true){
                consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consume() throws InterruptedException {

        synchronized (taskQueue){
            while (taskQueue.isEmpty()){
                System.out.println("Queue is empty " +
                        Thread.currentThread().getName() + " is waiting , size: " +
                        taskQueue.size());
                taskQueue.wait();
            }

            Thread.sleep(100);
            int i=taskQueue.remove(0);
            System.out.println("Consumed: "+i);
            taskQueue.notifyAll();
        }

    }
}


public class ProducerConsumerExampleWithWaitAndNotify {

    public static void main(String args[]){
        List<Integer> taskQueue=new ArrayList<>();
        int MaxSize=10;
        Thread tProducer=new Thread(new Producer(taskQueue,MaxSize),"Producer");
        Thread tConsumer=new Thread(new Consumer1(taskQueue),"Consumer1");
        tProducer.start();
        tConsumer.start();
    }
}
