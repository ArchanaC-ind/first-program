package com.Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    //Electricity Bill-input units
//    1-100 units rs10/unit
//    100-200 units rs15/unit
//    200-300 units rs20/unit
//    above 300 rs25/unit

    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int U=ip.nextInt();
        int cost=0;
        if(U<=100){
            cost=U*10;
        } else if (U>100 ||U<=200) {
            cost=U*15;
        } else if (U>200 ||U<=300) {
            cost=U*20;
        } else if (U>300) {
            cost = U*25;
        }
        System.out.println("Rs."+cost);
    }
}
