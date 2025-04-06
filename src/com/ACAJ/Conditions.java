package com.ACAJ;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        //print numbers from 1 to 5

//        for(int num=1;num<=5;num+=1){
//            System.out.println(num);
//        }

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

//        for(int i=0;i<n;i++){
//            System.out.println(i);
//        }

        int i=0;
        while(i<n){
            System.out.println(i);
            i+=1;
        }


    }
}
