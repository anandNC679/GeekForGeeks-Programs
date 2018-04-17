package com.PatternPrinting;

import java.util.Scanner;

/**
 * author anand.
 * since on 7/4/18.
     *
    ***
   *****


 */
public class Piramid {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=space;j++)
                System.out.print(" ");
            space--;

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        space=1;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space++;

            for (int k=1;k<=2*(n-i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
