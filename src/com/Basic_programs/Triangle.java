package com.Basic_programs;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Area of triangle
        Scanner n=new Scanner(System.in);
        int b=n.nextInt();
        int h=n.nextInt();

        double area=(b*h)/2;
        System.out.println(area);
    }
}
