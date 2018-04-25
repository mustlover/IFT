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


/*

PP 11.1
StringTooLong

Enter a sentence (Or type DONE to exit): happy go lucky

Enter a sentence (or type DONE to exit): Hello world

Enter a sentence (or type DONE to exit): there once was a man

Enter a sentence (or type DONE to exit): where have all the flowers gone
Exception in thread "main" StringTooLongException: String has too many characters!
	at StringTooLong.main(StringTooLong.java:21)

---END PROGRAM---

----------------------------------------------------------------------------------------

PP 11.2
StringTooLong

Please enter a sentence (or type DONE to exit):
1 have 4 cats and a tortoise
Error: 1 have 4 cats and a tortoise, contains more than 20 characters!

Please enter a sentence (or type DONE to exit):
Today i'm studying

Please enter a sentence (or type DONE to exit):
Yesterday was a good day
Error: Yesterday was a good day, contains more than 20 characters!

Please enter a sentence (or type DONE to exit):
Tomorrow will be better
Error: Tomorrow will be better, contains more than 20 characters!

Please enter a sentence (or type DONE to exit):
The future is ours

Please enter a sentence (or type DONE to exit):
done

---END PROGRAM---

 */