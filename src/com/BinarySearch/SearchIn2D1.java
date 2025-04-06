package com.BinarySearch;

import java.util.Arrays;

public class SearchIn2D1 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,8},
                {11,22,23,24,25},
                {49,51,52,53,60}
        };
        int target=23;
        System.out.println(Arrays.toString(Search(arr,target)));

    }
    static int[] Search(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;
        while(r< matrix.length&&c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}
