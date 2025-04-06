package com.ArraysList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDim {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int[][] arr2D = new int[3][2];

//        arr2D= new int[][]{
//                {2, 2, 2},
//                {3, 4, 2},
//                {5, 6, 4}
//        };

        int row;
        for (row = 0; row < arr2D.length; row++) {

            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = n.nextInt();
            }
        }

//        for(int row=0;row< arr2D.length;row++){
//
//            for(int col=0;col<arr2D[row].length;col++){
//                System.out.print(arr2D[row][col]+" ");
//            }
//            System.out.println();
//        }

//        for (int[] i : arr2D) {
//
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }




    }
}
