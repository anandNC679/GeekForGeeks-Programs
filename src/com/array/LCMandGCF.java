package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 22/3/18.
 */
public class LCMandGCF {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
        int y=scanner.nextInt();

        int lcm=findLCM(x,y);
        int gcf=findGCF(x,y);
        System.out.println("LCM="+lcm+" GCF="+gcf);

    }

    private static int findGCF(int x, int y) {
        int a=(x>y)?x:y;
        int b=(x<y)?x:y;
        int r=b;

        while (a%b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return r;
    }

    private static int findLCM(int x, int y) {

        int a=(x>y)?x:y;
        while (true){
            if(a%x==0 && a%y==0)
                return a;
            ++a;
        }
    }
}
