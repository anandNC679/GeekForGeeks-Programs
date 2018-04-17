package com.matrix;

import java.util.Scanner;

/**
 * author anand.
 * since on 29/3/18.
 */
public class CheckSparseMatrix {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of matrix(row/column)");
        System.out.print("row: ");
        int row=scanner.nextInt();
        System.out.print("column: ");
        int column=scanner.nextInt();

        int matrix[][]=new int[row][column];
        int count=0;
        System.out.println("Enter matrix element:");
        for(int i=0;i<row;i++){
            System.out.print("\nrow "+(i+1)+": ");
            for (int j=0;j<column;j++){
                matrix[i][j]=scanner.nextInt();
                if(matrix[i][j]==0)
                    ++count;
            }
        }

        System.out.println("Entered Matrix is:");
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        if(count>(row*column)/2)
            System.out.println("sparse matrix");
        else
            System.out.println("not a sparse matrix");
        System.out.println("no. of zero is: "+count);
    }
}
