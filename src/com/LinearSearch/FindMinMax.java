package com.LinearSearch;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr={25,23,-2,2,4,3,11,6};
        int ans=Minimum(arr);
        int res=Max(arr);
        System.out.println("Minumum : "+ans);
        System.out.println("Maximum : "+res);

    }
    static int Minimum(int[] arr) {
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (n > arr[i]) {
                n = arr[i];
            }
        }
        return n;
    }
    static int Max(int[] arr) {
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (n < arr[i]) {
                n = arr[i];
            }
        }
        return n;
    }
}
