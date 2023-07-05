package com.example.java;

import java.util.Scanner;

public class Java_04 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        char alphabet = scanner.next().charAt(0);
        switch (alphabet){
            case 'a','e','i','o','u' :
                System.out.println("It's a vowel");
                break;
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z' :
                System.out.println("It's a consonant");
                break;
            default: System.out.println("Please check the alphabet you are type before!");

        }
    }
}
