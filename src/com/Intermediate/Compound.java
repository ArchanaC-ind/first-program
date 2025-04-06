package com.Intermediate;

import java.util.Scanner;

public class Compound {

    public static void main(String[] args) {
        //Compound Interest=P(1+R/100)^t

        Scanner n=new Scanner(System.in);
        double P=n.nextDouble();
        double R=n.nextDouble();
        double t=n.nextDouble();

        double C=P*(Math.pow((1+(R/100)),t));
        System.out.println(C);
    }
}
