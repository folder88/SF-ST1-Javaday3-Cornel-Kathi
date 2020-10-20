package Kathi;

import java.util.Scanner;
/**
 * Write a Java program that reads a floating-point number and prints “zero”
 * if the number is zero. Otherwise, print “positive” or “negative”.                              <--- the doc comment
 * Add “small” if the value of the number is less than 1, or “large” if it exceeds 1,000,000.
 */

public class BasicTwo {


    public static void main(String[]args){



        Scanner in = new Scanner(System.in);         // <---- var Scanner to get the input
        System.out.println("input some number");
        float some = in.nextFloat();                // <--- get the ral input


        //################################## the if function to compare the input
        if(some == 0){
            System.out.println("zero");
        } else if(some < 0) {
            System.out.println(some + " is a negative number");
        } else if(some < 1) {
            System.out.println(some +" is a small number");
        } else if(some > 1000000) {
            System.out.println(some + " is a large positiv number");
        } else {
            System.out.println("positiv");
        }
    }
}
