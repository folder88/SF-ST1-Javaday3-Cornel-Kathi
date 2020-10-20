package Kathi;

import java.util.Scanner;

/**
 * Rewrite the solution task3 with a switch statement.
 */


//###################################### methode switch for weekdays
public class BasicFour {

    static void leSwitch(){
        Scanner in = new Scanner(System.in);

        System.out.println("which number for the week?");
        int week = in.nextInt();

        switch (week) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Today is donnerstag");
                break;
            case 5:
                System.out.println("Today is freitag");
                break;
            case 6:
                System.out.println("Today is samstag");
                break;
            case 7:
                System.out.println("Today is sonntag");
                break;
            case 8:
                System.out.println("Week has only 7 days!");
                break;
            default:
                System.out.println("tztztz....");
        }
    }

    public static void main(String[]args){

        leSwitch();  // <---- call the methode for the weekdays

    }
}
