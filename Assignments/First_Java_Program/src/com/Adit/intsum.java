package com.Adit;

import java.util.Scanner;

public class intsum {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int sum = 0 ;

        System.out.println("Enter integers followed by enter and 0 to end. Get the sum\n");

        while (true){

            System.out.print("Enter numeral : ");
            int num = input.nextInt();

            if (num == 0) {

                String strsum = Integer.toString(sum) ;

                System.out.print("The sum is " + strsum);
                break;
            }
            else {
                sum += num ;
            }
        }

    }

}
