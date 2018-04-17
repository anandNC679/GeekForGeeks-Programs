package com.samsung;

/**
 * author anand.
 * since on 17/4/18.
 * Count number of bits to be flipped to convert A to B
 * Input : a = 10, b = 20
 Output : 4
 Binary representation of a is 00001010
 Binary representation of b is 00010100
 We need to flip highlighted four bits in a
 to make it b.

 question 2: Swap two nibbles in a byte
 ex: 100=01100100
 1st nibble=0110,2nd nibble=0100 , swap them then 01000110 which is 70
 */
public class CountFlippRequired {
    public static void main(String args[]){
        int a=13,b=20;
       countFlipped(a^b);
       swapNibbles(100);
    }

    private static void swapNibbles(int i) {

        int result= ((i & 0x0F) << 4) | ((i & 0xF0) >> 4) ;
        System.out.print(result);
    }

    private static void countFlipped(int i) {
        int count = 0;
        while (i != 0){
            count += i & 1;
            i >>= 1;
        }
        System.out.println("no of bit need to change: "+count);
    }
}
