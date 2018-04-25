// ************************************************************
// Author: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// Date: 3/25/18
// PlusTest.java
// Demonstrate the different behaviors of the + operator
// ************************************************************
public class PlusTest
{

    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------

    public static void main (String[] args) {
        //Prints This is a long string that is the concatenation of two shorter strings.
        System.out.println ("This is a long string that is the " + "concatenation of two shorter strings.");

        //Prints The first computer was invented about55years ago.
        System.out.println ("The first computer was invented about" + 55 + "years ago.");

        //Prints 8 plus 5 is 85
        System.out.println ("8 plus 5 is " + 8 + 5);

        //Prints 8 plus 5 is 13
        System.out.println ("8 plus 5 is " + (8 + 5));

        //Prints 13 equals 8 plus 5.
        System.out.println (8 + 5 + " equals 8 plus 5.");
        }
}
/*
***************************************Explanation***************************************************************

8 plus 5 is 85
This is an concatenation problem. The program is told to put * and 5 together.

8 plus 5 is 13
This is an addition problem. The program is told to add 8 + 5 which is in parenthesis.

13 equals 8 plus 5.
This is an addition problem. The program is told to add 8 + 5 which is at the beginning
of the program so it is treated as an addition, instead of concatenation.

d. To fix System.out.println ("The first computer was invented about" + 55 + "years ago.");
you need to add a space after about and a space before years. So it would look like...
System.out.println ("The first computer was invented about " + 55 + " years ago.");

*****************************************************************************************************************
 */