//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************

import java.util.*;

public class LA211 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a integer (whole number): ");
        int number = Integer.parseInt(scan.next()); //converts integer to string
        scan.close(); //closes scan

        if (number % 5 == 0) //finds if number input is divisible by 5
        {
            System.out.println("\nHiFive!");
        }
        if(number % 2 == 0)//finds if number input is divisible by 2
        {
            System.out.println("\n HiEven!");
        }

        //end of program
        System.out.println("\nEnd of program.");
    }
}
