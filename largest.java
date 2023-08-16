package com.Shreya;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("a is largest");
            }else{
                System.out.println("c is largest");
            }
        } else{
            if (b>c){
                System.out.println("b is largest");
            }else {
                System.out.println("c is largest");
            }
        }
    }
}
