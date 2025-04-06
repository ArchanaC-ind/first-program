package com.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={23,25,4,3,2,11};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr){
        Boolean swap=false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }
}
