package com.example.java;

import java.util.Scanner;

public class Java_08 {
    public static void main(String[] args){
        System.out.println("Lets calculate the area of a triangle...");

        System.out.println("Enter the base of the triangle in cm :");

        Scanner input=new Scanner(System.in);
        double base = input.nextDouble();
        while (base<=0){
            System.out.println(" Your base value is incorrect. Please enter the base of the triangle in cm :");
            base = input.nextDouble();
        }
        System.out.println("Enter the height of the triangle in cm :");
        double height = input.nextDouble();
        while (height<=0){
            System.out.println(" Your height value is incorrect. Please enter the height of the triangle in cm :");
            height = input.nextDouble();
        }

        double area = (base*height)/2;
        System.out.println("Area of the triangle is " + area + "cm²");
    }
}
