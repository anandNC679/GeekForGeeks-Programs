package com.array;

import java.util.Stack;

/**
 * author anand.
 * since on 28/3/18.
 */
public class NextGreater {
    public static void main(String args[]){
        int arr[]={17,8,19,3};

        NextGreater nextGreater=new NextGreater();
        nextGreater.findNextArray(arr);
        System.out.println("------------------");
        nextGreater.findNextStack(arr);
    }

    private void findNextStack(int[] arr) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(arr[0]);
        int next=0,element=0;
        for(int i=1;i<arr.length;i++){
            next=arr[i];

            if(!stack.isEmpty()){
                element=stack.pop();
                while (element<next){
                    System.out.println(element + " --> " + next);
                    if(stack.empty())
                        break;
                    element=stack.pop();
                }

                if(element>next)
                    stack.push(element);
            }
            stack.push(next);

        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+"-->"+"-1");
        }
    }

    private void findNextArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
           int next=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    next=arr[j];
                    break;
                }
            }
            System.out.println(next);
        }
    }
}
