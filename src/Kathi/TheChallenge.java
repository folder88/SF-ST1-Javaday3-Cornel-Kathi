package Kathi;

import java.util.Scanner;

/**
 * Expand the program to produce a result in the console like this:
 * The biggest one is 52, the 2nd one is 24, and the smallest one is 11.
 */

public class TheChallenge {

    // ########################################## function for challenge
    static void leChallenge(){
        Scanner in = new Scanner(System.in);
        System.out.println("please,enter number one");
        int one = in.nextInt();
        System.out.println("now,the second number");
        int two = in.nextInt();
        System.out.println("and the last number");
        int three = in.nextInt();

        if(one > two && one > three){
            if(two > three){
                System.out.println("The biggest one is " + one + ", the 2nd one is " + two + ", and the smallest is " + three);
            } else {
                System.out.println("The biggest one is " + one + ", the 2nd one is " + three + ", and the smallest is " + two);
            }
        } else if(two > one && two > three){
            if(one > three){
                System.out.println("The biggest one is " + two + ", the 2nd one is " + one + ", and the smallest is " + three);
            } else {
                System.out.println("The biggest one is " + two + ", the 2nd one is " + three + ", and the smallest is " + one);
            }
        } else {
            if(two > one){
                System.out.println("The biggest one is " + three + ", the 2nd one is " + two + ", and the smallest is " + one);
            } else {
                System.out.println("The biggest one is " + three + ", the 2nd one is " + one + ", and the smallest is " + two);
            }
        }
    }

    public static void main(String[]args){

        leChallenge(); // <---- call the function

    }
}
