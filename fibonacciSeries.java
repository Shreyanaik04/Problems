package com.Shreya;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<=n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.print(n+"th is "+ b);
    }
}
