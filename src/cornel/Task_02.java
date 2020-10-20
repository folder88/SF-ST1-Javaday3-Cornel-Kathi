package cornel;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        float x =input.nextFloat();


        if(x == 0){
            System.out.println("Your number is 0");
        }
        else if(x < 1){
            System.out.println("Your number is less that 1");
        }

        else if (x > 1000000){
            System.out.println("Your number is large");
        }


    }
}
