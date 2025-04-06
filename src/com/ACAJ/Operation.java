package com.ACAJ;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        //Take 2 numbers and an operator(+,-,*,/) and calculate the value .(Use if condition)
        Scanner input= new Scanner(System.in);
        System.out.println("enter the Operation:");
        char S=input.next().charAt(0);

        System.out.println("enter A:");
        int A=input.nextInt();

        System.out.println("enter B:");
        int B=input.nextInt();

        int op;

        if(S=='+'){
           op=A+B;
        }
        else if(S=='-'){
            op=A-B;
        }
        else if(S=='*'){
            op=A*B;
        }
        else if(S=='/'){
            op=A/B;
        }
        else{
            op=0;
        }
        System.out.println("result:"+op);



    }


}
