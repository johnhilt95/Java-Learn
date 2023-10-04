package com.example.java;

import java.util.Scanner;

public class Java_09 {
    public static double employeeSalary(int noOfHoursEmployeeWorkForWeek,double moneyPerHour){
        int noOfHoursEmployeeWorkForYear = noOfHoursEmployeeWorkForWeek*4*12;
        double employeeSalaryForYear = noOfHoursEmployeeWorkForYear*moneyPerHour;
        return employeeSalaryForYear;
    }

    public static void main(String[] args){
        System.out.println("Enter the number of hours employee work for a week :");
        Scanner scanner = new Scanner(System.in);
        int noOfHoursEmployeeWorkForWeek = scanner.nextInt();
        System.out.println("Enter the amount of money per hour :");
        Scanner input = new Scanner(System.in);
        double moneyPerHour = input.nextDouble();
        System.out.println("Employee Salary for Year is " + employeeSalary( noOfHoursEmployeeWorkForWeek,moneyPerHour));
    }
}
