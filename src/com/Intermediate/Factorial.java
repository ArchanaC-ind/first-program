package com.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Factorial
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();

        int res=1;
        for(int i=2;i<=n;i++){
            System.out.println(res);
            res*=i;
        }
    }
}
