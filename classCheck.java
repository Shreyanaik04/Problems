package com.Shreya;

import java.util.Scanner;

public class classCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or line: ");
        char ch = input.next().trim().charAt(0) ;
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("Uppercase");
      }
    }
}
