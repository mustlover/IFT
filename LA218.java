//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************
import java.util.Scanner;

public class LA218 {

    public static void main(String[] args) {

        int num;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please enter a positive number: ");
            num = scan.nextInt();
            if(num <1)
                System.out.println("Error, please enter 1 or above.");
            }while(num <1);

        scan.close();

        for(int i = 1; i <= num; i++)
        {
            sum = sum + i; //sums the numbers from 1 to given number
        }
        System.out.println("\nThe sum of 1 to " + num + ", is: " + sum);

        //end of program
        System.out.println("\nEnd of program.");

    }
}