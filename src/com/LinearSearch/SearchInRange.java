package com.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr={2,3,4,5,6,7,8,9,11,12,23,25};
        int element=in.nextInt();

        int start=2;
        int end=10;
        int ans=Search(arr,element,start,end);
        System.out.println("index "+ans);

    }
    static  int Search(int[] arr,int element,int start,int end ){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
