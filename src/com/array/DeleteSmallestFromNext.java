package com.array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * author anand.
 * since on 23/3/18.
 */
public class DeleteSmallestFromNext {
    public static void main(String args[]){
        int arr[]={20, 10, 25, 30, 40,41,56};

        Stack<Integer> stack=new Stack<>();
        int count=0;
        stack.push(arr[0]);
        int k=3;
        for(int i=1;i<arr.length;i++){
            while (!stack.isEmpty() && stack.peek()<arr[i] && count<k){

                stack.pop();count++;
            }
            stack.push(arr[i]);
        }
        int m=stack.size();
        //arr=null;
       arr=new int[m];

       for(int i=m-1;i>=0;i--){
           arr[i]=stack.peek();
           stack.pop();
       }

        for(int a:arr)
            System.out.print(a+" ");

    }
}
