package com.Intermediate;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Distance {
    public static void main(String[] args) {
        //Distance between 2 points
        int x1=3;
        int y1=4;
        int x2=5;
        int y2=7;

        int Distance= (int) sqrt(pow((x1-y1),2)+pow((x2-y2),2));
        System.out.println(Distance);


    }
}
