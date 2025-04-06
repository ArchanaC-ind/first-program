package com.StrBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a="Archana";
        String b="Archana";

        //Compares that the values are same or not
        System.out.println(a==b);


        String name1=new String("Archana");
        String name2=new String("Archana");

        //though the values are same but they are different object
        System.out.println(name1==name2);

        //checks only value
        System.out.println(name1.equals(name2));
    }
}
