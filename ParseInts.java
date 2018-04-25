// ****************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab 6
// File: ParseInts.java
// Date: 4/22/18
// Reads a line of text and prints the integers in the line.
// ****************************************************************
import java.util.Scanner;
public class ParseInts
{
    public static void main(String[] args)
    {
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text: ");
        Scanner scanLine = new Scanner(scan.nextLine());

        while (scanLine.hasNext())
        {
            try
            {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
            catch (NumberFormatException exception)
            {

            }
        }
            System.out.println("The sum of the integers on this line is " + sum);

        System.out.println("\n---END PROGRAM---");

    }
}

/*

Enter a line of text:
 roy roger
The sum of the integers on this line is 0

---END PROGRAM---

Enter a line of text:
 1 2 50 42
The sum of the integers on this line is 95

---END PROGRAM---

Enter a line of text:
I have 4 cats and 1 tortoise
The sum of the integers on this line is 5

---END PROGRAM---

 */
