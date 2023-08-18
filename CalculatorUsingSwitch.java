package com.Shreya;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 , num2 , answer;
        String choice;
        while (true){
            System.out.println("Select operator: ");
            char operator = in.next().charAt(0);
            System.out.println("Enter num1: ");
            num1 = in.nextInt();
            System.out.println("Enter num2: ");
            num2 = in.nextInt();
            switch (operator) {
                case '+' -> {
                    answer = num1 + num2;
                    System.out.println("answer = " + answer);
                }
                case '-' -> {
                    answer = num1 - num2;
                    System.out.println("answer = " + answer);
                }
                case '/' -> {
                    answer = num1 / num2;
                    System.out.println("answer = " + answer);
                }
                case '%' -> {
                    answer = num1 % num2;
                    System.out.println("answer = " + answer);
                }
                case '*' -> {
                    answer = num1 * num2;
                    System.out.println("answer = " + answer);
                }
                default -> {
                    System.out.println("Please enter a valid operator");
                    continue;
                }
            }
            System.out.println("Select Y / N ");
            choice = in.next();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Continued!!");
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Thanks for using Calculator!!");
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please try again...");
            }
        }

    }
}
