package com.Funcmethod;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
    multi(2,true,"AC","AJ","ACAJ");
    }
    static void multi(int a,boolean n,String ...v){
        System.out.println(a + Arrays.toString(v) + n);
    }
}
