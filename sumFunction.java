package com.Shreya;

import java.util.Scanner;

public class sumFunction {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter num1: ");
            int num1 = in.nextInt();
            System.out.print("Enter num2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of the numbers = " +sum);
            System.out.println("Do you want to keep adding ? Y/N");
            String choice = in.next();
            if(choice.equalsIgnoreCase("Y")){
                System.out.println("Continued");
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Thank you!");
                System.exit(0);
            }else {
                System.out.println("Please select valid choice!!");
            }
        }
    }
}
