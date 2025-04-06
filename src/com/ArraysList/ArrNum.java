package com.ArraysList;

import java.util.Scanner;

public class ArrNum {
    public static void main(String[] args) {

        Scanner ip=new Scanner(System.in);

        int[] n=new int[5];

        System.out.println(n[1]); // prints 0 since not initialised.

//        n[0]=2;
//        n[1]=3;
//        n[2]=2;
//        n[3]=4;
//        n[4]=8;

        //to take input of a array
        for(int i=0;i<n.length;i++){
            n[i]=ip.nextInt();
        }
//         to print the array
//        System.out.println("array of a numbers:");
//        for(int i=0;i<n.length;i++){
//            System.out.println(n[i]);
//        }

        //to print array
        for (int j : n) {
            System.out.println(j);
        }


        //to print the array
       // System.out.println(Arrays.toString(n));
    }
}
