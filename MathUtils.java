// ****************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab 6
// File: MathUtils.java
// Date: 4/22/18
// Provides static mathematical utility functions.
// ****************************************************************
public class MathUtils
{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    // "The factorial of a number is defined as the product of natural numbers
    // from one to that particular number. Mathematically,
    // n! = 1 * 2 * 3 * .... * (n-1) * n
    // For example, the factorial of 4 is
    // 4! = 1 * 2 * 3 * 4 = 24"
    // http://www.javawithus.com/programs/factorial
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException
    {

        if (n < 0) // smallest possible factorial with a positive return
        {
            throw new IllegalArgumentException(n + " is invalid! Number cannot be negative.");
        }

        // factorial of 12 = 479,001,600 and factorial of 13 is 6,227,020,800
        // int is 2,147,483,648 to -2,147,483,648
        if (n > 12) // largest possible factorial that can be used with an integer
        {
            throw new IllegalArgumentException(n + " is invalid! cannot be greater than 12.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;



    }
}

