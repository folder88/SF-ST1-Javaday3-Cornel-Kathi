package Kathi;

import java.util.Scanner;

/**
 * Write a program, which outputs “Fizz” if the number is a multiplier of 3 and outputs “Buzz”
 * if the number is a multiplier of 5. If the number is a multiplier of both, 3 and 5 output “FizzBuzz”.
 * If the number is not divisible by 3 or 5 just output the number.
 */

public class IntermediateThree {


    //############################### fizzBuzz function
    static void fizzBuzz(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter some number");
        int some = in.nextInt();

        if((some % 3 == 0) & (some % 5 == 0)){
            System.out.println("FizzBuzz");
        } else if(some % 3 == 0){
            System.out.println("Buzz");
        } else if(some % 5 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println(some);
        }
    }

    public static void main(String[]args){

        fizzBuzz();  // <--- call the function

    }
}
