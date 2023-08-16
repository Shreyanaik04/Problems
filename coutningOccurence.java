package com.Shreya;

import java.util.Scanner;

public class coutningOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = in.nextInt();
        System.out.print("Count no :");
        int repeat = in.nextInt();
        int count = 0;
        while(num!=0){
            if (num%10==repeat){
                count = count + 1;

            }
            num = num/10;
        }System.out.println("No of occured= "+ count);

    }

}
