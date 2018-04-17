package com.array;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * author anand.
 * since on 19/3/18.
 */
public class Febonacci {
    static Scanner scanner;
    public static void main(String args[]){
        scanner=new Scanner(System.in);
        Febonacci febonacci=new Febonacci();
        int ch=0;
        int len=0;
        do{
            System.out.println("1.Fibonacci :");
            System.out.println("2.Fibonacci recursive:");
            System.out.println("3.Exit");
            System.out.print("\nEnter option:-");
            ch=scanner.nextInt();
            switch (ch){
                case 1:

                    break;
                case 2:
                    System.out.print("\nEnter n:");
                    len=scanner.nextInt();
                    int result=febonacci.findFibonacci(len);
                    System.out.println("\n"+result);
                    break;

            }
        }while(ch!=3);
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    private int findFibonacci(int n) {
        if(n<=1) {
            return n;
        }
        else {
            return (findFibonacci(n - 1) + findFibonacci(n - 2));
        }
    }

}
