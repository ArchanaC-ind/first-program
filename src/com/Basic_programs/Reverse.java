package com.Basic_programs;

public class Reverse {

    public static void main(String[] args) {
        int n=9327;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
