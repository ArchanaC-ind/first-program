package com.Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        //power of a number
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int power=n.nextInt();
        int output= (int) Math.pow(num,power);
        System.out.printf(num+" to the power of "+power+" = "+output);
    }
}
