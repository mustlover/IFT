//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************
import java.util.Scanner;

public class LA215 {

    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please solve the following: 5 + 9: ");
        num = scan.nextInt();

        while (num != 13) {
            System.out.println("Incorrect, please try again!");
            System.out.println("Please solve the following: 5 + 9: ");
            num = scan.nextInt();
        }
        System.out.println("Correct, you're a math wiz!");

        //end of program
        System.out.println("\nEnd of program.");

    }
}