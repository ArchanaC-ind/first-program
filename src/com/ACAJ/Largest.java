package com.ACAJ;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //take 2 input and print the largest number
        Scanner input=new Scanner(System.in);

        System.out.println("enter A:");
        int A=input.nextInt();

        System.out.println("enter B:");
        int B=input.nextInt();

        if(A>B){
            System.out.println(A+" is Largest Number");
        }
        else if(A<B){
            System.out.println(B+" is Largest Number");
        }

    }
}
