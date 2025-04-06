package com.Intermediate;

public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int orginal =n;
        double sum=0;
        double rem=0;
        while(n>0){
            rem=n%10;
            sum= (int) (sum+Math.pow(rem,3));
            n=n/10;
        }
        System.out.println(sum);
        if(sum==orginal){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not a Armstrong number");
        }
        }
    }

