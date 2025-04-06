package com.ACAJ;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD
        Scanner input=new Scanner(System.in);
        System.out.println("enter the Rupees:");
        double R=input.nextInt();

        double USD=R*0.011;

        System.out.println("US dollar:"+USD);

    }
}
