package com.Adit;

import java.util.Scanner;

public class larger_num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number : ");
        float fnum = input.nextFloat();

        String strfnum = Float.toString(fnum);

        System.out.println("Enter Second number : ");
        float snum = input.nextFloat();

        String strsnum = Float.toString(snum);

        if (fnum < snum) {
            System.out.println("The second number (" + strsnum + ") is bigger ");
        }

        if (fnum > snum) {
            System.out.println("The first number (" + strfnum + ") is bigger \n");
        }

        else {
            System.out.println("Dude, they are equal. This was obvious. Use your own brain");
        }
    }
}
