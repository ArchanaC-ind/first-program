package com.Basic_programs;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //Area of rectangle

        Scanner n=new Scanner(System.in);
        int b=n.nextInt();
        int h=n.nextInt();

        int area=b*h;

        System.out.println(area);
    }
}
