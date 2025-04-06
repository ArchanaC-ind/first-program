package com.Funcmethod;

import java.util.Scanner;

//define the program to find out whether the given number is even or odd
public class EvenOdd {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num= ip.nextInt();

        Fn(num);
    }
    static void Fn(int n){
        if(n%2==0){
            System.out.println(n+"->Even");
        }
        else{
            System.out.println(n+"->Odd");
        }
    }
}
