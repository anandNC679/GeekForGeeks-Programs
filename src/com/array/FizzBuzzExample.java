package com.array;

/**
 * author anand.
 * since on 19/3/18.
 */
public class FizzBuzzExample {
    public static void main(String args[]){
        System.out.println();

        for(int i=1;i<=100;i++){
            if(i%10==3 || i/10==3)
                System.out.print("Fizz ");
            else
                if(i%10==5 || i/10==5)
                    System.out.print("Buzz ");
            else
                    System.out.print(i+" ");
        }

        //System.out.println(3%10);
    }
}
