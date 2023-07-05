package com.example.java;

import java.util.Scanner;

public class Java_01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("What is your name?");
        String name=scanner.nextLine();
        System.out.println("what is your rating about movie 1 to 5?");
        Integer rate=scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your email?");
        String email=scanner.nextLine();
        System.out.println("Please,Enter the number to create a pyramid?");
        int number=scanner.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("Your rating is " + rate);
        System.out.println("Your email is " + email);
        System.out.println("   "+number);
        System.out.println("  "+number+number+number);
        System.out.println(" "+number+number+number+number+number);
        System.out.println(""+number+number+number+number+number+number+number);
    }
}
