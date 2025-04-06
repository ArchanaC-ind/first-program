package com.ACAJ;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.

        Scanner input= new Scanner(System.in);
        String n=input.nextLine();

        System.out.println("Hi!"+n);
    }
}
