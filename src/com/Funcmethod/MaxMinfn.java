package com.Funcmethod;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user

import java.util.Scanner;

public class MaxMinfn {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("size:");

        int size=ip.nextInt();
        int[] n=new int[size];

        System.out.println("enter "+size+" numbers");
        for(int i=0;i<n.length;i++){
            n[i]=ip.nextInt();
        }

        int max=Maximum(n);
        int min=Minimum(n);

        System.out.println(max);
        System.out.println(min);

    }
    static int Maximum(int[] arr){
        int x=arr[0];
        for(int i=1;i< arr.length;i++){
            if(x<arr[i]){
                x=arr[i];
            }
        }
        return x;
    }
    static int Minimum(int[] arr){
        int x=arr[0];
        for(int i=1;i< arr.length;i++){
            if(x>arr[i]){
                x=arr[i];
            }
        }
        return x;
    }

}
