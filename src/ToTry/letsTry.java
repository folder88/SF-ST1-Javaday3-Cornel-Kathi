package ToTry;

import java.util.Scanner;

public class letsTry {

    public static void BasicOne(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int a = in.nextInt();

        if(a == 25){
            System.out.println("Number is positiv");
        } else {
            System.out.println("Number is negativ");
        }
    }

    public static void BasicTwo(){
        Scanner in = new Scanner(System.in);
        System.out.println("input some number");
        float some = in.nextFloat();

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

    public static void BasicThree(){
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

    public static void BasicFour(){
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

}
