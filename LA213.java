//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************

import java.util.Scanner;

public class LA213 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int year = scan.nextInt();
        scan.close(); //closes scan

        //leap year is divisible by 400 and 4 but not 100.
        if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0)) //calculates if the year is a leap year
        {
            System.out.println(year + " is a leap year!");
        }
        else//tells user the year is not a leap year
        {
            System.out.println("Sorry, " + year + " is NOT a leap year");
        }

        //end of program
        System.out.println("\nEnd of program.");

    }
}