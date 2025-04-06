package com.LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="Archana";
        char element='h';

        boolean ans=Search(str,element);
        System.out.println(ans);


    }
    static boolean Search(String str,char element){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
           if(element==str.charAt(i)){
               return true;
           }
        }
        return false;
    }
}
