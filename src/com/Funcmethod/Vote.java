package com.Funcmethod;

import java.util.Scanner;

//A person is eligible to vote if age is greater than or equal to 18.
// Define a method to find out if a person is eligible to vote
public class Vote {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.print("enter your age:");
        int age = ip.nextInt();

        Eligible(age);
    }
    static void Eligible(int n){
        System.out.println(n >= 18 ? "eligible to vote" : "Not eligible");
    }
}
