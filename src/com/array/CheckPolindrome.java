package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 26/3/18.
 */
public class CheckPolindrome {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        if(t>=1 && t<=25){
            for(int i=1;i<=t;i++){
                long n=scanner.nextLong();
                String numInStringForm="",revNumInStringForm="";
                long rem=0;
                while(n>0){
                    rem=n%2;
                    numInStringForm+=rem;
                    revNumInStringForm=rem+revNumInStringForm;
                    n=n/2;
                }
                System.out.println(numInStringForm);
                if(numInStringForm.equals(revNumInStringForm))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
