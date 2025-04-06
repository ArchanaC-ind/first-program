package com.ACAJ;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        //to input principal, time, rate from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);

        System.out.println("enter the principal:");
        int P=input.nextInt();

        System.out.println("enter the rate of interest:");
        double R=input.nextDouble();

        System.out.println("enter the number of years");
        int T=input.nextInt();

        double SI=(P*R*T)/100;
        System.out.println("Simple Interest:"+SI);
    }
}
