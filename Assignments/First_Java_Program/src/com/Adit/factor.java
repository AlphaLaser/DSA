package com.Adit;

import java.util.Scanner;

public class factor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );

        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("\nFactors : \n");
        for (int i = 1; i <= num; i++ ){
            if (num % i == 0){

                String stri = Integer.toString(i);

                System.out.println("--> "+ stri);
                continue;
            }
            else{
                continue;
            }
        }

        int raw = input.nextInt() ;
    }
}
