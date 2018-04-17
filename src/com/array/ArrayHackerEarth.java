package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 22/3/18.
 */
public class ArrayHackerEarth {

    static Scanner scanner;
    public static void main(String args[]){
        scanner=new Scanner(System.in);

        int t=scanner.nextInt();

        for(int i=0;i<t;i++){
            System.out.println("Enter length:");
            int len=scanner.nextInt();
            int arr[]=new int[len];
            for(int j=0;j<len;j++){
             arr[i]=scanner.nextInt();
            }
            int n=scanner.nextInt();
            int count=0;
            int arr1[]=new int[len];
            int k;
            for(k=0;k<len;k++){
                if(n==arr[k]){
                    arr[k]=1;
                }
                else {
                    arr1[count++]=arr[k];
                }
            }

            System.out.println("k="+k+" arr=");
            for(int a:arr1)
                System.out.print(a+" ");


            for(int j=k,first=0;j<len;j++)
                arr[j]=arr1[first++];

            System.out.println();
            for(int a:arr)
            System.out.print(a+" ");

        }
    }
}
