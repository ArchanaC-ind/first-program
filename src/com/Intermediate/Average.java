package com.Intermediate;

import java.util.Scanner;

public class Average {
    //Average of N
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        int N=0;
        int d=t;

        while(t-->0){
             N=ip.nextInt();
            N+=N;
        }
        int Avg= N/d;
        System.out.println(Avg+" "+ N+" "+ d);
    }
}
