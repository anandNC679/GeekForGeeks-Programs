package com.stack_implementation;

import java.util.Stack;

/**
 * author anand.
 * since on 31/3/18.
 */
public class QueueUsing2stack {

    static class MyQueue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }

    public static void main(String args[]){
        MyQueue queue=new MyQueue();
        queue.stack1=new Stack<Integer>();
        queue.stack2=new Stack<Integer>();

        enQueue(queue,1);
        enQueue(queue,3);
        enQueue(queue,2);
        System.out.println(dQueue(queue));
        System.out.println(dQueue(queue)); System.out.println(dQueue(queue));


    }

    private static int dQueue(MyQueue queue) {
        int x=0;
        if(queue.stack1.isEmpty() && queue.stack2.isEmpty()){
            System.out.println("Queue is empty:");
            System.exit(0);
        }

        if(queue.stack2.isEmpty()){
            while (!queue.stack1.isEmpty()){
                x=queue.stack1.pop();
                pushToStack(queue.stack2,x);
            }
        }
        x=queue.stack2.pop();
        return x;
    }

    private static void enQueue(MyQueue queue, int i) {
        pushToStack(queue.stack1,i);
    }

    private static void pushToStack(Stack<Integer> stack1, int i) {
        stack1.push(i);
    }
}
