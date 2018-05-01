package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 29/4/18.
 */
public class GCD {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter 2 numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("gcd of "+a+" and "+b+" = "+findGCD(a,b));
    }

    private static int findGCD(int a, int b) {
        if(b==0)
            return a;
        else
            return findGCD(b,a%b);
    }
}
