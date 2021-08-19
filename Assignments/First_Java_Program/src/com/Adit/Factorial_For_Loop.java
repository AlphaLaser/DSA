package com.Adit;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Factorial_For_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int tnum = input.nextInt();

        int factorial = 1 ;

        for (int iter = 1 ; iter <= tnum ; iter += 1 ) {
            factorial = factorial * iter ;
        }

        System.out.println(factorial);

    }
}
