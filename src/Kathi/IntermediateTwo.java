package Kathi;

import java.util.Scanner;

/**
 * Write a program to check whether a number is even or odd
 */

public class IntermediateTwo {

     // ############################## the function to check
    static void evenOr(){

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to check");
        int check = in.nextInt();

        if(check % 2 == 0){
            System.out.println("you choose: " + check + " <--- this number is even");
        } else {
            System.out.println("you choose: " + check + " <--- this number is odd");
        }
    }

    public static  void main(String[]args){
        evenOr(); // <----- call the function
    }
}
