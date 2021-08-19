package com.Adit;


import java.util.Scanner;

public class ruptodoll {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in) ;

        System.out.println("Enter the amount in Rupees ");
        double rup = input.nextDouble();

        double doll = rup * 0.013 ;

        String strdol = Double.toString(doll);

        System.out.println("The amount entered is equal to " + strdol + "$");

    }

}
