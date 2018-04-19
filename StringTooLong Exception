// ****************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird HW 6
// File: StringTooLong.java
// Date: 4/22/18
// Calculates inputted string and determines if it is too long.
// Throws an exception.
// ****************************************************************
import java.util.Scanner;

public class StringTooLong {

    /*
    PP 11.1
    Write a program that creates an exception class called StringTooLongException,
    designed to be thrown when a string is discovered that has too many characters in it.
    In the main driver of the program, read strings from the user until the user
    enters “DONE”. If a string is entered that has too many characters (say 20),
    throw the exception. Allow the thrown exception to terminate the program.
    */

   public static void main(String [] args) throws StringTooLongException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence (or type DONE to exit): ");
        String str = scan.nextLine();

        while(!str.equalsIgnoreCase("DONE"))
        {
            if (str.length() > 20)
                throw new StringTooLongException("String has too many characters!");

            System.out.println("\nPlease enter a sentence (or type DONE to exit): ");
            str = scan.nextLine();
        }

        System.out.println("\n---END PROGRAM---");
    }
}

    /*
    PP 11.2
    Modify the above solution such that it catches and handles the exception if it is
    thrown. Handle the exception by printing an appropriate message, and then continuing
    processing more strings.
     */

    public static void main(String [] args) throws StringTooLongException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence (or type DONE to exit): ");
        String str = scan.nextLine();

        while(!str.equalsIgnoreCase("DONE")) {
            try{
                if (str.length() > 20)
                    throw new StringTooLongException("Excess of characters.");
            }
            catch(StringTooLongException ex){
                System.out.println ("Error: " + str + ", contains more than 20 characters!");
            }
            System.out.println("\nPlease enter a sentence (or type DONE to exit): ");
            str = scan.nextLine();
        }
        System.out.println("\n---END PROGRAM---");
    }
}

// ****************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird HW 6
// File: StringTooLongException.java
// Date: 4/22/18
// Sets up exception for StringTooLong.java
// ****************************************************************

public class StringTooLongException extends Exception{

    public StringTooLongException(String message){
        super(message);

    }
}
