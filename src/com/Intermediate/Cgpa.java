package com.Intermediate;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        //CGPA
        Scanner n=new Scanner(System.in);

        int N=n.nextInt();
        int Grade=0;
        int Credit=0;

        int Total_grade=0;
        int Total_credit=0;

        while(N-->0){
            Grade=n.nextInt();
            Credit=n.nextInt();

            Total_grade+=Grade*Credit;
            Total_credit+=Credit;

        }
        System.out.println(Total_grade/Total_credit);
    }
}
