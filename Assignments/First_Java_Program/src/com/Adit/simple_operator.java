package com.Adit;

import java.util.Objects;
import java.util.Scanner;

public class simple_operator {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number : ");
        float fnum = input.nextFloat() ;

        System.out.println("Enter the second number : ");
        float snum = input.nextFloat() ;

        System.out.println("Enter the operator : ");
        String operator = input.next() ;


            if (Objects.equals(operator, "+")) {

                float sum = fnum + snum ;

                String strsum = Float.toString(sum);

                System.out.println("You chose addition \n\nThe sum of the two entered numbers is  " + strsum);

            }

            if (Objects.equals(operator, "*")){

                float mul = fnum * snum ;

                String strmul = Float.toString(mul);

                System.out.println("You chose multiplication \n\nThe product of the two entered numbers is  " + strmul);

            }

            if (Objects.equals(operator, "-")){

                float diff = fnum - snum ;

                String strdiff = Float.toString(diff);

                System.out.println("You chose subtraction \n\nThe difference of the two entered numbers is  " + strdiff);

            }


            if (Objects.equals(operator, "/")){

                float div = fnum/snum ;

                String strdiv = Float.toString(div);

                System.out.println("You chose division \n\nThe quotient of the entered operation is  " + strdiv);

            }
            else {

                System.out.println("Please enter a correct operation");

            }

        }
    }

