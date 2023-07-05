package com.example.java;

import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number?");
        int a=scanner.nextInt();
        System.out.println("Enter Second Number?");
        int b=scanner.nextInt();
        int c;
        c=a+b;
        System.out.println("Result of adding two numbers = "+c);
        c=a-b;
        System.out.println("Result of substracting two numbers = "+c);
        c=a*b;
        System.out.println("Result of multiple two numbers = "+c);
        c=a/b;
        System.out.println("Result of Diving two numbers = "+c);
        //a=a+100;
        a+=100;
        System.out.println(a);

        int x=3,y=4,z;
        z=x + y + x++ + y++ + ++x + ++y;
        System.out.println(z);
    }
}
