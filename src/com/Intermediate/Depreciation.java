package com.Intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        //Depreciation=i[1-r/100]^t

        Scanner n=new Scanner(System.in);

        double x=n.nextInt();
        double r=n.nextInt();
        double t=n.nextInt();
        double i=1-(r/100);
        double value=x*(Math.pow(i,t));

        System.out.println(value);

    }
}
