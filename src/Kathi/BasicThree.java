package Kathi;

import ToTry.letsTry;

import java.util.Scanner;

/**
 * Write a Java program that keeps an integer  between 1 and 7 in a variable  and         *
 * displays the name of the weekday based on that number.
 */

public class BasicThree {

    /*
    For 1, output is:
    Today is Monday
    For 3, output is:
    Today is Wednesday
    For 8, output is:
    Week has only 7 days!
     */

    // ########################################### Scanner plus else if for weekdays
    static void weekdays(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number");
        int theNumber = in.nextInt();

        if(theNumber == 1){
            System.out.println("Today is Monday");
        } else if(theNumber == 2){
            System.out.println("Today is Dienstag");
        } else if(theNumber == 3){
            System.out.println("Mittwoch");
        } else if(theNumber == 4) {
            System.out.println("Today is donnerstag");
        } else if(theNumber == 5) {
            System.out.println("Today is freitag");
        } else if(theNumber == 6) {
            System.out.println("Today is samstag");
        } else if(theNumber == 7) {
            System.out.println("Today is sonntag");
        } else if(theNumber == 8) {
            System.out.println("Week has only 7 days!");
        }
    }

    public static void main(String[]args){

        weekdays();   //<---- call the method "weekdays"
        letsTry objThree = new letsTry();
        objThree.BasicThree();
    }
}
