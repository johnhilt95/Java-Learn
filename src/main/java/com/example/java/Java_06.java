package com.example.java;

import java.util.Scanner;

public class Java_06 {
    public static void main(String[] args){
        System.out.println("Enter the number below 1 to 10 ?");
        Scanner Scanner = new Scanner(System.in);
        int input = Scanner.nextInt();
        if(input<5){
            System.out.println("The number is below 5");
        }else{
            System.out.println("The number is equal to 5 or above 5");
        }
    }
}
