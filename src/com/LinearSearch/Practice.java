package com.LinearSearch;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={2,5,3,1,7,9,6,8,11,15,17,22,23,24,25};
//        int element=in.nextInt();
        String sample=in.nextLine();
        /*int ans=Search(arr,element);*/
//        System.out.println(ans);
//
//        //Maximum
//        int Max_value=Max(arr);
//        System.out.println("Maximum no:"+Max_value);

        System.out.println("name"+sample+"nospace");




    }
    static int Search(int[] arr,int element){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    static int Max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int n=arr[0];
        for(int i=0;i< arr.length;i++){
            if (n< arr[i]) {
                n=arr[i];
            }
        }
        return n;
    }
}
