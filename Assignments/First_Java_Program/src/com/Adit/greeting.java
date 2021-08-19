package com.Adit;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter name : ");
        String name = input.next();

        System.out.println("Wishing you a good day, " + name);
    }
}
