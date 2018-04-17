package com.string;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * author anand.
 * since on 5/4/18.
 */
public class RemoveDublicate {
    static Scanner scanner;
    public static void main(String args[]){
        scanner=new Scanner(System.in);
        System.out.print("Input String :- ");
        String str=scanner.next();
        System.out.println();
        boolean flag=true;
        while (true){

            System.out.println("1. O(n*n) using 2 loop :-");
            System.out.println("2. O(nlog(n))  :-");
            System.out.println("3. O(log(n)) :-");
            System.out.println("4. O(n) using Hashing technique:-");
            System.out.println("5. Exit :-");
            System.out.println("remove duplicate with time complexity:");
            int num=scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("updated String: "+removeDuplicate(str)+"\n");
                    break;
                case 4:
                    System.out.println("updated String: "+removeDuplicateUsingSet(str)+"\n");
                    break;
                case 5:
                    System.out.println("bye:");
                    flag=false;
                    System.exit(0);
                    break;
            }
        }
    }

    private static String removeDuplicateUsingSet(String str) {
        Set<Character> set=new LinkedHashSet();
        String result="";
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        Iterator<Character> characterIterator=set.iterator();
        while (characterIterator.hasNext()){
            result+=characterIterator.next();
        }
        return result;
    }

    private static String removeDuplicate(String str) {
        String result="";

        int count=0;
        for(int i=0;i<str.length();i++){
            int j;
            for(j=0;i<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    break;
                }
            }

            if(j==i){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
