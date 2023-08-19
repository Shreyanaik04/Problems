package com.Shreya;

import java.util.Scanner;

public class swapFunction {
    public static void main(String[] args) {
        swap();
    }

    static void swap() {
        Scanner in = new Scanner(System.in);
        int num1, num2, temp;
        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
    }
}
