package com.stack_implementation;

/**
 * author anand.
 * since on 31/3/18.
 * using array
 */
public class MyStack {

    public static int MAX=1000;
    int top;
    int arr[]=new int[MAX];

    public MyStack() {
        this.top = -1;
    }

    public static void main(String args[]){
        MyStack myStack=new MyStack();
        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        myStack.push(500);

        myStack.printStack();
        int num=myStack.pop();
        System.out.println("deleted item="+num);
        myStack.printStack();

    }

    private void printStack() {
        if(isEmpty()){
            System.out.println("stack is empty:");
            return;
        }
        int damiTop=top;
        while (damiTop>0){
            System.out.println(arr[damiTop--]);
        }
    }

    private int pop() {
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top--];
    }

    private boolean isEmpty() {
        if(top<0)
            return true;
        else
            return false;
    }

    private void push(int i) {
        if(top>MAX){
            System.out.println("stack overflow:");
            return;
        }
        arr[++top]=i;
    }


}
