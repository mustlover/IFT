// ****************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab 6
// File: Factorials.java
// Date: 4/22/18
// Reads integers from the user and prints the factorial of each.
// ****************************************************************
import java.util.Scanner;
public class Factorials
{
    public static void main(String[] args)
    {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
            System.out.print("\nEnter an integer: ");
            int val = scan.nextInt();

            try
            {
                System.out.println("Factorial(" + val + ") = "
                        + MathUtils.factorial(val));
            }
            catch (IllegalArgumentException expObj)
            {
                System.out.println(expObj.getMessage());
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }

        System.out.println("\n---END PROGRAM---");
    }
}
/* --------------PROGRAM OUTPUT--------------
Factorials

Enter an integer: 12
Factorial(12) = 479001600
Another factorial? (y/n) y

Enter an integer: 13
13 is invalid! cannot be greater than 12.
Another factorial? (y/n) y

Enter an integer: 5
Factorial(5) = 120
Another factorial? (y/n) y

Enter an integer: -12
-12 is invalid! Number cannot be negative.
Another factorial? (y/n) n

---END PROGRAM---
 */

