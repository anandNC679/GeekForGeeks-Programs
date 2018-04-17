package com.stack_implementation;

import java.util.Stack;

/**
 * author anand.
 * since on 31/3/18.
 */
public class StockSpanProblem {
    public static void main(String args[]){
        int arr[]=new int[]{10, 4, 5, 90, 120, 80};
        int span[]=new int[arr.length];
        int span1[]=new int[arr.length];
        calculateSpan(arr,span);
        calculateSpanUsingStack(arr,span1);
        for(int s:span)
            System.out.print(s+" ");
        System.out.println("\nspan1");
        for(int s:span1)
            System.out.print(s+" ");
    }

    private static void calculateSpanUsingStack(int[] arr, int[] span1) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        span1[0]=1;
        for(int i=1;i<arr.length;i++){
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            span1[i]=(stack.isEmpty())?i+1:(i-stack.peek());
            stack.push(i);
        }

    }

    private static void calculateSpan(int[] arr, int[] s) {
        s[0]=1;
        for(int i=1;i<arr.length;i++){
            s[i]=1;
            for(int j=i-1;j>=0 && arr[i]>arr[j];j--)
                s[i]++;
        }
    }
}
