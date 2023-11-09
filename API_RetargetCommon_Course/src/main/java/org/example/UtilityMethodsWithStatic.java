package org.example;

public class UtilityMethodsWithStatic {

    public static int salary = 10000000;

    public static void display()
    {
        System.out.println("THis is for static import mrthdos");
    }

    public static void add(int a, int b)
    {
        System.out.println("addition of 2 numbers "+(a+b));
    }

    public static void add(int a,int b,int c)
    {
        System.out.println("NOn Static method");
    }
}
