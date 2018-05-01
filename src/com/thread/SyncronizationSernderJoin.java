package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author anand.
 * since on 1/5/18.
 */

class Sender{
    public void send(String msg){
        System.out.println("Sending "+msg+" ...");
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(msg+" sent !");
    }
}

class SenderThread extends Thread{

    String msg;
    Sender sender;

    public SenderThread(String msg, Sender sender) {
        this.msg=msg;
        this.sender=sender;
    }

    @Override
    public void run() {

            sender.send(msg);

    }
}
public class SyncronizationSernderJoin {

    public static void main(String args[]){

        Sender sender=new Sender();
        SenderThread senderThread1=new SenderThread("Hi",sender);
        SenderThread senderThread2=new SenderThread("Bye",sender);

       /* senderThread1.start();
        senderThread2.start();

        try {
            senderThread1.join();
            senderThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        List list=new ArrayList();

        Object obj[]=new Object[2];
        Arrays.stream(obj).forEach(i->{
            System.out.println("value= "+i);
        });

    }
}
