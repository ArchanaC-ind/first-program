package com.ObjectOriented;

public class Basic {
    public static void main(String[] args) {

        //new-initialising the instance variable AJ
        //Student()-constructor
    Student AJ=new Student();

        System.out.println(AJ.rno);
        System.out.println(AJ.name);
    }
    static class Student{
        int rno;
        String name;
        float marks;

        //Constructor to get the parameter
        Student(){
            //to add values for different object,
            // we use 'this' keyword to Access the object
            this.rno=25;
            this.name="Archana";
            this.marks= 98.5F;

        }
    }
}
