package Kathi;
import ToTry.letsTry;

import java.util.Scanner;

/**
 * this is a program that saves a number in a variable and prints whether it is   <--- the doc comment
 * positive or negative *
 */

public class BasicOne {
        /*
            Example: for input number 25, expected output should be:    <---- the multicomment to descripe the task
            Number is positive
        */

   /* static void info(int b){
        if(b == 25){                        <-----a mulitiline comment to comment out
            System.out.println("positiv");
        }
    }*/

    static void vergleich(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int a = in.nextInt();

        if(a == 25){
            System.out.println("Number is positiv");
        } else {
            System.out.println("Number is negativ");
        }
    }

    public static void main(String[]args) {
        //int some = info();  <---singe comment to comment out
        BasicOne objHere = new BasicOne();

        //vergleich();

        objHere.BasicOne();



       /* if(a == 25){
            System.out.println("Number is positiv");  <-----a mulitiline comment to comment out
        }*/




    }
}
