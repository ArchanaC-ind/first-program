package com.Intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        // discount product
        Scanner ip=new Scanner(System.in);
        int M=ip.nextInt();
        int S=ip.nextInt();

        int Discount =(M-S);
        int DiscountPerct=(Discount/M);
        System.out.println(DiscountPerct);
    }
}
