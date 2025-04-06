package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {

        int[][] arr={
                {3,4,5,6,7},
                {11,8,23,2,25,17,21},
                {27,10,22,24},
                {51,60,53}
        };
        int element=25;
        int ans[]  =Search(arr,element);

        System.out.println("index:"+Arrays.toString(ans));

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

}
