package com.ACAJ;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //to calculate fibonacci Series up to n numbers
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        int firstnum=0;
        int secondnum = 1;
        while(i<n){
            System.out.print(firstnum+" ");

            int nextnum=firstnum+secondnum;

            firstnum=secondnum;
            secondnum=nextnum;

            i++;
        }

    }
}
