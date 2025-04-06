package com.LinearSearch;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr={2,3,4,5,6,7,8,9};
        int element=in.nextInt();
        int ans=Search(arr,element);
        System.out.println("index "+ans);

    }
    static  int Search(int[] arr,int element ){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
