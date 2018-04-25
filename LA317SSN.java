//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Checking SSN validity
//Date: 4/1/18
//******************************************
import java.util.Scanner;

public class LA317SSN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Social Security number
        System.out.print("Enter a SSN (xxx-xx-xxx): ");
        String ssn = input.nextLine();

        // Check whether the input is valid
        boolean isValid =
                (ssn.length() == 11) &&
                        (Character.isDigit(ssn.charAt(0))) &&
                        (Character.isDigit(ssn.charAt(1))) &&
                        (Character.isDigit(ssn.charAt(2))) &&
                        (ssn.charAt(3) == '-') &&
                        (Character.isDigit(ssn.charAt(4))) &&
                        (Character.isDigit(ssn.charAt(5))) &&
                        (Character.isDigit(ssn.charAt(7))) &&
                        (ssn.charAt(6) == '-') &&
                        (Character.isDigit(ssn.charAt(8))) &&
                        (Character.isDigit(ssn.charAt(9))) &&
                        (Character.isDigit(ssn.charAt(10)));

        // Display result
        if(isValid == true) {
            System.out.println(ssn + " is a valid Social Security Number.");
        }
        else{
            System.out.println(ssn + " is NOT a valid Social Security Number.");
        }

        System.out.println("\n-----END PROGRAM-----");
    }
}

/* -------------PROGRAM OUTPUT-------------

Enter a SSN (xxx-xx-xxx): 123-12-1234
123-12-1234 is a valid Social Security Number.

-----END PROGRAM-----

Enter a SSN (xxx-xx-xxx): 123456789
123456789 is NOT a valid Social Security Number.

-----END PROGRAM-----


 */