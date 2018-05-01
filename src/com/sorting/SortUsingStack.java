package com.sorting;

import java.util.Arrays;
import java.util.Stack;

/**
 * author anand.
 * since on 26/4/18.
 */
public class SortUsingStack {
    public static void main(String a[]){
        int arr[]=new int[]{10,2,34,54};
        sortArrayUsingStack(arr);
    }

    private static void sortArrayUsingStack(int[] arr) {
        Stack<Integer> input=new Stack<>();
        Arrays.stream(arr).forEach(i -> {
            input.push(i);
        });
        Stack<Integer> tempStack=new Stack<>();
        while (!input.isEmpty()){
            int temp=input.pop();
            while (!tempStack.isEmpty() && tempStack.peek()<temp){
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()){
            System.out.print(tempStack.pop()+" ");
        }
    }
}
