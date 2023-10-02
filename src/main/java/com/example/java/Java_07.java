package com.example.java;

import java.util.Scanner;

public class Java_07 {
    public static void main(String[] args){
        String question = "What is the 5th square number?";
        String choiceOne = "36";
        String choiceTwo = "9";
        String choiceThree = "25";

        String correctAnswer = choiceThree;

        System.out.println(question);
        System.out.println("The answer is : " + choiceOne +" "+ choiceTwo +" "+ choiceThree);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(correctAnswer.equals(input)){
            System.out.println("Congrats. Your answer is correct!!!");
        }else {
            System.out.println("Your answer is wrong. The correct answer is " + correctAnswer );
        }
    }
}
