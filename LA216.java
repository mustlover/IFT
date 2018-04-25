//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************

import java.util.*;

public class LA216 {

    public static void main(String[] args) {

        int num;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer, (enter 0 to end): ");
        num = scan.nextInt();

        while (num != 0) {
            sum = sum + num;
            System.out.println("Please enter an integer, (enter 0 to end): ");
            num = scan.nextInt();
        }
        System.out.println("The total of all integers entered is: " + sum);
        //end of program
        System.out.println("\nEnd of program.");

    }

}
