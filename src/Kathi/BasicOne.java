package Kathi;

import java.util.Scanner;

/**
 * this is a program that saves a number in a variable and prints whether it is
 * positive or negative *
 */

public class BasicOne {
        /*
            Example: for input number 25, expected output should be:
            Number is positive
        */

    static void info(int b){
        if(b == 25){
            System.out.println("positiv");
        }
    }

    public static void main(String[]args) {
        //int some = info();

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number 25");
        int a = in.nextInt();

        //System.out.println("Number is positiv");

       /* if(a == 25){
            System.out.println("Number is positiv");
        }*/




    }
}
