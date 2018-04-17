package com.matrix;

import java.util.Scanner;

/**
 * author anand.
 * since on 29/3/18.
 */
public class SearchElementInSortedMatrix {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50} };

        System.out.print("Enter element to search: ");
        int num=scanner.nextInt();
        searchElemnt(mat,4,num);
    }

    private static void searchElemnt(int[][] mat, int order, int num) {
        int i=0,j=order-1;
        while (i<order && j>=0){
            if(mat[i][j]==num) {
                System.out.println("found at: ["+i+","+j+"] position");
                return;
            }

            if(mat[i][j]>num){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("element not found:");
        return;
    }
}
