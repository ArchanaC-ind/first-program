package com.ObjectOriented.StaticExample;

public class Person{
    int age;
    String name;
    int Salary;
    boolean martialStatus;
    static long population;

    Person(int year, String naam,int ctc,boolean martialStatus){
        this.age=year;
        this.name=naam;
        this.Salary=ctc;
        this.martialStatus=martialStatus;
        Person.population+=1;
    }

}
