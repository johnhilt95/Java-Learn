package com.example.java;

import java.util.Scanner;

public class Java_05 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the nth number of odd numbers :");
        int n = scanner.nextInt();
        int i=1;
        while(i<=n){
            System.out.print((i*2)-1 + " ");
            i++;
        }
    }
}
