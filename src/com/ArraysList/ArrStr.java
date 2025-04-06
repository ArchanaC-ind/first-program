package com.ArraysList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrStr {
    public static void main(String[] args) {

        Scanner ip=new Scanner(System.in);
        String[] str=new String[5];
        System.out.println(str[2]); //prints Null,since it is not initialised

        for (int i=0;i< str.length;i++){
            str[i]=ip.nextLine();
        }

//        for (int i=0;i< str.length;i++){
//            System.out.println(str[i]);
//        }
//        for (String s : str) {
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(str));

    }
}
