package com.Intermediate;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        //Combination=n!/r!(n-r)!

        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int r=x.nextInt();

        combination(n,r);
        System.out.println("Combination: "+combination(n,r));

        Permutation(n,r);
        System.out.println("Permutation: "+Permutation(n,r));
    }

    static int factorial(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    static int combination(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    static int Permutation(int n,int r){
        return factorial(n)/factorial(n-r);
    }
}
