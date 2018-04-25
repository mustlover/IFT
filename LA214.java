//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************
import java.util.Scanner;

public class LA214 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number corresponding to a month:");
        int month = scan.nextInt();

        switch(month)
        {
            case 1:
                System.out.println("The month entered is January");
                break;
            case 2:
                System.out.println("The month entered is February");
                break;
            case 3:
                System.out.println("The month entered is March");
                break;
            case 4:
                System.out.println("The month entered is April");
                break;
            case 5:
                System.out.println("The month entered is May");
                break;
            case 6:
                System.out.println("The month entered is June");
                break;
            case 7:
                System.out.println("The month entered is July");
                break;
            case 8:
                System.out.println("The month entered is August");
                break;
            case 9:
                System.out.println("The month entered is September");
                break;
            case 10:
                System.out.println("The month entered is October");
                break;
            case 11:
                System.out.println("The month entered is November");
                break;
            case 12:
                System.out.println("The month entered is December");
                break;
            default:
                System.out.println("Sorry, this month doesn't exist!");
        }

        //end of program
        System.out.println("\nEnd of program.");

    }
}