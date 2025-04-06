package com.LinearSearch;

import java.util.Arrays;

public class MinMaxIn2D {

    public static void main(String[] args) {
        //error in max
        int[][] arr={
                {3,4,5,6,7},
                {11,8,23,2,25,17,21},
                {27,10,22,24},
                {51,60,53}
        };
        int element=25;
        int ans[]  =Search(arr,element);
        int Mx[]  =Max(arr);
        int Mn[]  =Min(arr);
        System.out.println("index:"+ Arrays.toString(ans));
        System.out.println("Max index:"+Arrays.toString(Mx));
        System.out.println("Min index:"+Arrays.toString(Mn));
    }
    static int[] Search(int[][] arr,int element){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==element){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Max(int[][] arr){

        if(arr.length==0){
            return new int[]{-1,-1};
        }
        int n=arr[0][0];
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]>n){
                    n=arr[r][c];

                }
                return new int[]{r,c};
            }

        }
        return new int[]{-1,-1};

    }
    static int[] Min(int[][] arr){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        int n=arr[0][0];
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]<n){
                    n=arr[r][c];
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
