package Kathi;

import java.util.Scanner;

/**
 * Write Java program to allow the user to input his/her age.
 * Then the program will show if the person is eligible to vote.
 * A person who is eligible to vote must be older than or equal to 18 years old.
 */

public class AdvancedTwo {

    static void vote(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter your age");
        int theAge = in.nextInt();

        if(theAge >= 18){
            System.out.println("the person is eligible to vote");
        } else {
            System.out.println("the person is not eligible to vote");
        }
    }

    public static void main(String[]args){

        vote();

    }
}
