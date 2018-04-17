package com.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * author anand.
 * since on 28/3/18.
 */



public class StrongPassword {

    static int minimumNumber(int n, String password) {

        int count=0;
        Pattern patternDigit=Pattern.compile("(\\d)");
        Matcher matcherDigit=patternDigit.matcher(password);
        Pattern patternUpper=Pattern.compile("([A-Z])");
        Matcher matcherUpper=patternUpper.matcher(password);
        Pattern patternLower=Pattern.compile("([a-z])");
        Matcher matcherLower=patternLower.matcher(password);
        Pattern patternSpecialChar=Pattern.compile("(\\W)");
        Matcher matcherSpecialChar=patternSpecialChar.matcher(password);

        if(!matcherDigit.find()) {
            count++;

        }
        if(!matcherLower.find()) {
            count++;

        }
        if(!matcherUpper.find()) {
            count++;

        }
        if(!matcherSpecialChar.find()) {
            count++;

        }

        if ((count+password.length())<6) {
            count = 6-password.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();

    }
}
