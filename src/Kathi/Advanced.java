package Kathi;

import java.util.Scanner;

/**
 * Write a program that finds the maximum of 3 numbers (by using if/else). Discuss with
 * your partner.
 */

public class Advanced {

    // ######################################## function start
    static void theMaximumOfThree(){
        Scanner in = new Scanner(System.in);
        System.out.println("please,enter number one");
        int one = in.nextInt();
        System.out.println("now,the second number");
        int two = in.nextInt();
        System.out.println("and the last number");
        int three = in.nextInt();

        if(one > two && one > three){
            System.out.println("number one is the largest");
        } else if(two > one && two > three){
            System.out.println("number two is the largest");
        } else {
            System.out.println("number three is the largest");
        }

    }

    public static void main(String[]args){

        theMaximumOfThree();  // <---- call the function

    }
}
