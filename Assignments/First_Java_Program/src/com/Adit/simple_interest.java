package com.Adit;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter Principle (In Rupees) : ");
        float principle = input.nextFloat();

        System.out.println("Enter Rate (In percentage) : ");
        float rate = input.nextFloat();

        System.out.println("Enter Time (In years) : ");
        float time = input.nextFloat();

        float si = ((principle*rate*time)/(100)) ;

        String final_si = Float.toString(si) ;


        System.out.println("The Simple interest is : " + final_si + " Rupees");
    }
}
