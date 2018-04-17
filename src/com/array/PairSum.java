package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 19/3/18.
 */
public class PairSum {
    static Scanner scanner;
    static int arr[];
    public static final int Max=100000;
    public static void main(String args[]){
        PairSum pairSum = new PairSum();
        scanner=new Scanner(System.in);
     //   pairSum.inputArray();

        int ch=0;
        System.out.print("\nEnter sum of pair to find in array :-");
        int sum=scanner.nextInt();
        do {
            System.out.println("\n*****Enter type of search:*****");
            System.out.println("1.Count no. of pairs of given sum :");
            System.out.println("2.find all pairs :");
            System.out.println("3.Exit :");
            System.out.print("\nchoose one option:-");
            ch=scanner.nextInt();

               switch (ch) {
                   case 1:
                      // pairSum.checkPairMethod1(arr, sum);
                       break;
                   case 2:
                       pairSum.checkPairMethod2(arr, sum);
                       break;
               }
       }while (ch!=3);

    }
    private void checkPairMethod2(int[] arr, int sum) {
        boolean b[] = new boolean[Max];
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (temp >= 1 && b[temp]) {
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] + "," + temp + ")");
            }
            b[arr[i]] = true;
        }
//    private void checkPairMethod1(int[] arr, int sum) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("count of pairs of sum " + sum + " is " + count);
//    }
    }
    private void inputArray() {
        scanner=new Scanner(System.in);
        System.out.print("\nEnter length of array :- ");
        int len=scanner.nextInt();
        arr=new int[len];
        System.out.print ("\nEnter elements :- ");
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
    }
}
