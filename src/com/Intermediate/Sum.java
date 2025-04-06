package com.Intermediate;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        int N=n.nextInt();
        int Sum=0;
        while(N-->0){
            int num=n.nextInt();
            Sum+=num;
        }
        System.out.println(Sum);
    }
}
