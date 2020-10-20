package cornel;

import java.util.Scanner;

public class Task_03 {

    public static void main(String[] args) {

        method_02();

    }
public static void method(){




    String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number between 0 and 7");
    int x = scan.nextInt();
    if(x == 0){
        System.out.println("Today is " + days[x]);
    }
    else if(x == 1){
        System.out.println("Today is " + days[x]);
    }
    else if(x == 2){
        System.out.println("Today is " + days[x]);
    }
    else if(x == 3){
        System.out.println("Today is " + days[x]);
    }
    else if(x == 4){
        System.out.println("Today is " + days[x]);
    }
    else if(x == 5){
        System.out.println("Today is " + days[x]);
    }
    else if(x == 6){
        System.out.println("Today is " + days[x]);
    }
    else{
        System.out.println("Your number is not correct");
    }

}

public static void method_02(){

    String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();


        switch(y){
            case 0:
                System.out.println("Today is " + days[y]);
                break;

            case 1:
                System.out.println("Today is " + days[y]);
                break;
            case 2:
                System.out.println("Today is " + days[y]);
                break;
            case 3:
                System.out.println("Today is " + days[y]);
                break;
            case 4:
                System.out.println("Today is " + days[y]);
                break;
            case 5:
                System.out.println("Today is " + days[y]);
                break;
            case 6:
                System.out.println("Today is " + days[y]);
                break;
            default:
                System.out.println("Your number is not correct");


        }
}

}
