package cornel;

import java.util.Scanner;

public class Task_04 {


    public static void main(String[] args){

        method_02();
    }



    public static void method_01(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number ");
        float x = scan.nextFloat();
        System.out.println("Enter your secind number ");
        float y = scan.nextFloat();

        if(x < y){
            System.out.println("Your second number is bigger");
        }
        else{
            System.out.println("Your first number si bigger");
        }
    }

    public static void method_02(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");

        float x = scan.nextFloat();
        float y = x%2;

        if(y == 0){
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
    }
    public static void method_03(){

    }
}
