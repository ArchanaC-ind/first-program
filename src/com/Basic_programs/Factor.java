package com.Basic_programs;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number

        Scanner n=new Scanner(System.in);
        int x=n.nextInt();

        for(int i=1;i<x;i++){
            if(x%i==0){
                System.out.println(i);
            }
        }
    }
}
