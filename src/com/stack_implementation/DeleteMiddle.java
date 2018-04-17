package com.stack_implementation;

import java.util.Stack;

/**
 * author anand.
 * since on 31/3/18.
 */
public class DeleteMiddle {
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();

        for(int i=1;i<5;i++){
            stack.push(i);
        }
       // printStackList(stack);
        delete(stack,stack.size(),0);
        System.out.println("after delete middle:");
        printStackList(stack);

        }

    private static void printStackList(Stack<Integer> stack) {
        Stack<Integer> demoStack=stack;
        while (!demoStack.isEmpty()){
            System.out.println(demoStack.pop());
        }
        demoStack.clear();
    }

    private static void delete(Stack<Integer> stack, int size, int curr) {

        if(stack.isEmpty() || curr==size){
            return;
        }

        int x=stack.pop();
        delete(stack,size,curr+1);
        if(curr!=size/2)
            stack.push(x);
    }
}
