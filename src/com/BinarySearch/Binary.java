package com.BinarySearch;

public class Binary {
    public static void main(String[] args) {
        int[] arr={-3,-1,0,2,3,8,11,22,23,24,25,48,51,53,60};
        int target = 25;
        int ans=Search(arr,target);
        System.out.println(ans);

    }
    static int Search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid =start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
