package com.Intermediate;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        //Commission Percentage
        Scanner ip=new Scanner(System.in);
        double Amount=1000;

        double x=200;
        double perct;
        perct=(x/Amount)*100;
        System.out.println(perct+"%");

    }
}
