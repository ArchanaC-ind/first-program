package com.ExceptionHandle;
import java.util.*;
public class SampleExc {
    public static void main(String[] args) {
//        String str= null;
//        System.out.println(str.length());


        //Arithemetic Exception
        try{
            int a=23;int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("cant divide");
        }
        //NumberformatException
        try{
            int num= Integer.parseInt("archana");
        } catch (NumberFormatException e) {
            System.out.println("not a anumber");

        }
    }
}
