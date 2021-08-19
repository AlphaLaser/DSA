package com.Adit;

import java.util.Scanner ;

public class largest_sum {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int max_num = 0 ;

        System.out.println("Enter integers followed by enter and 0 to end. Get the largest number\n");


        while (true){

            System.out.print("Enter Number : ");
            int num = input.nextInt();

            if (num == 0) {

                String strMaxNum = Integer.toString(max_num) ;
                System.out.println("The largest number you entered was " + strMaxNum);
                break;
            }
            else {
                if (num > max_num) {
                    max_num = num ;
                    continue;
                }

                else {
                    continue;
                }

            }
        }

    }

}
