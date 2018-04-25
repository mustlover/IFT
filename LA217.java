//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************
import java.util.Scanner;

public class LA217 {

    public static void main(String[] args) {

        int num;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please enter an integer, (type 0 to stop): ");
            num = scan.nextInt();
            sum = sum + num;
        } while (num != 0);
            {
                System.out.println("The total of all integers entered is: " + sum);
            }

        //end of program
        System.out.println("\nEnd of program.");

    }
}