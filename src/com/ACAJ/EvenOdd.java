package com.ACAJ;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //to print whether a number is even or odd, also take input from the user
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
