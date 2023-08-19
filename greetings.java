package com.Shreya;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        myGreet();
    }
    static void myGreet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Whats your name?");
        String name = in.nextLine();
        System.out.print("Hello "+ name + "! Welcome to our restaurant . We're happy to have you here");
    }
    static String greet( String name){
        String message = "Hello "+ name + "! Welcome to our restaurant . We're happy to have you here";
        return message;
    }
}
