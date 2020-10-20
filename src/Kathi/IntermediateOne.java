package Kathi;

import java.util.Scanner;

/**
 * Write a program to find maximum between two numbers.
 */

public class IntermediateOne {

    //########################################### the function for higher number
    static void differenz(){
        Scanner in = new Scanner(System.in);
        System.out.println("please,enter number one");
        int one = in.nextInt();
        System.out.println("please,now,the second number");
        int two = in.nextInt();

        if(one < two){
            System.out.println("the second number is higher");
        } else if(one > two){
            System.out.println("the first number is higher");
        } else {
            System.out.println("both numbers have the same value");
        }
    }

    public static void main(String[]args){
        differenz();  // <---- call the function
    }
}
