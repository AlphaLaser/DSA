package com.Adit;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");

        int tnum = input.nextInt();

        int lower_limit = tnum - 1;

        while (lower_limit != 0) {
            tnum = tnum * lower_limit;
            lower_limit = lower_limit - 1;
        }

        System.out.println(tnum);

    }
}

























































