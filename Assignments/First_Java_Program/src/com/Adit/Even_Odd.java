package com.Adit;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter Number : ");
        int num = input.nextInt() ;

        if (num >= 0){

            if (num % 2 == 0) {
                System.out.println("The number is even");

            }
            else {
                System.out.println("The number is odd");
            }

        }

        else {
            System.out.println("Negative numbers are neither even nor odd");
        }

    }
}
