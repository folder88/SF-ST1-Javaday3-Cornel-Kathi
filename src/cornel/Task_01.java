package cornel;

import java.util.Scanner;

public class Task_01 {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        float x =input.nextFloat();


        if(x > 0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is negative");
        }



    }
}
