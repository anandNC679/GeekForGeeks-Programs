package com.stack_implementation;

/**
 * author anand.
 * since on 31/3/18.
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }
}
public class MyStackUsingLinklist {

    Node head=null;
   public static void main(String args[]){

       MyStackUsingLinklist stack=new MyStackUsingLinklist();
       stack.push(100);
       stack.push(600);
       stack.push(10);
       stack.push(180);


       stack.printStack();
       int num=stack.pop();
       System.out.println("popped element:"+num);
       stack.printStack();
   }

    private void printStack() {
       if(isEmpty()){
           System.out.println("stack is empty:");
           return;
       }
       Node curr=head;
       while (curr!=null){
           System.out.println(curr.data);
           curr=curr.next;
       }
    }

    private int pop() {
       if(isEmpty()){
           System.out.println("stack is empty:");
           return -1;
       }
       int top=head.data;
       head=head.next;
       return top;
    }

    private boolean isEmpty() {
       if(head==null)
           return true;
       else
           return false;
    }

    private void push(int data) {
       Node node=new Node(data);
       if(isEmpty()){
           head=node;
           return;
       }
       node.next=head;
       head=node;
    }
}
