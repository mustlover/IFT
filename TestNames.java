// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: TestNames.java
// Date: 4/1/18
// Program that runs the Name.java class where the user enters
// in two names and arranges the names either by first middle
// last or last first middle and then counts how many characters
// are in the name and if the names are equal in length.
// ************************************************************

import java.util.Scanner;
public class TestNames
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Name name1, name2;

        //asks user for their first middle and last name
        System.out.println("Please enter your first name: ");
        String first1 = scan.nextLine();
        System.out.println("Please enter your middle name: ");
        String middle1 = scan.nextLine();
        System.out.println("Please enter you last name: ");
        String last1 = scan.nextLine();

        //asks user for a different first middle and last name
        System.out.println("\nPlease enter a different first name: ");
        String first2 = scan.nextLine();
        System.out.println("Please enter a different middle name: ");
        String middle2 = scan.nextLine();
        System.out.println("Please enter a different last name: ");
        String last2 = scan.nextLine();

        //sores input entered by user as name1 and name2
        name1 = new Name(first1, middle1, last1);
        name2 = new Name(first2, middle2, last2);

        //Prints out the two names by first middle last
        System.out.println("\nYour name is: " + name1.firstMiddleLast());
        System.out.println("The other name is: " + name2.firstMiddleLast());

        //Prints out the two names by last, first middle
        System.out.println("\nAnother way to type your name is: " + name1.lastFirstMiddle());
        System.out.println("Another way to type the other name is: " + name2.lastFirstMiddle());

        //Prints out the two names initials
        System.out.println("\nYour initials are: " + name1.initials());
        System.out.println("The other name's initials are: " + name2.initials());

        //Prints out the character length of the two names
        System.out.println("\nYour name, " + name1.firstMiddleLast() + ", is " + name1.length() + " characters long.");
        System.out.println("The other name, " + name2.firstMiddleLast() + ", is " + name2.length() + " characters long.");

        //compares the two names for equality of length and prints out if the two names are the same length or not
        if(name1.length() == name2.length()) {
            System.out.println("\nI've compared your name with the other and both names are the same length.");
        }
        else{
            System.out.println("\nI've compared your name with the other name and they are different lengths.");
        }

        System.out.println("\n-----End Program------");
    }
}

/*-------------------------------------PROGRAM OUTPUT-------------------------------------
Please enter your first name:
Suzy
Please enter your middle name:
Alexa
Please enter you last name:
Kaufman

Please enter a different first name:
Rosie
Please enter a different middle name:
Elizabeth
Please enter a different last name:
Pindrock

Your name is: Suzy Alexa Kaufman
The other name is: Rosie Elizabeth Pindrock

Another way to type your name is: Kaufman, Suzy Alexa
Another way to type the other name is: Pindrock, Rosie Elizabeth

Your initials are: S.A.K.
The other name's initials are: R.E.P.

Your name, Suzy Alexa Kaufman, is 16 characters long.
The other name, Rosie Elizabeth Pindrock, is 22 characters long.

I've compared your name with the other name and they are different lengths.

-----End Program------
 */