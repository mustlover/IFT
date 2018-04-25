// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: Comparisons.java
// Date: 4/8/18
// The is the program will run the class Compare3.java. It
// asks the user to input three string values and three integer
// values determining which is the largest.
// ************************************************************

import java.util.Scanner;

public class Comparisons {

    public static void main(String[] args) {

        String val1, val2, val3;
        int i1, i2, i3;

        Scanner scan= new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        val1 = scan.nextLine();
        System.out.print("Please enter the second string: ");
        val2 = scan.nextLine();
        System.out.print("Please enter the third string: ");
        val3 = scan.nextLine();
        System.out.println("The largest string is: " + Compare3.largest(val1,val2,val3));
        System.out.println();
        System.out.print("Please enter the first integer: ");
        i1 = scan.nextInt();
        System.out.print("Please enter the second integer: ");
        i2 = scan.nextInt();
        System.out.print("Please enter the third integer: ");
        i3 = scan.nextInt();
        System.out.println("The largest integer is: " + Compare3.largest(i1,i2,i3));

        System.out.println("---END PROGRAM---");
    }
}

/* -------------PROGRAM OUTPUT-------------

Test 1
Please enter the first string: Hotdogs
Please enter the second string: Chicken
Please enter the third string: Potpie
The largest string is: Potpie

Please enter the first integer: 123
Please enter the second integer: 346
Please enter the third integer: 457
The largest integer is: 457

---END PROGRAM---

Test 2
Please enter the first string: Roger
Please enter the second string: Rosie
Please enter the third string: Amanda
The largest string is: Roger

Please enter the first integer: 234
Please enter the second integer: 46
Please enter the third integer: 235
The largest integer is: 235

---END PROGRAM---

 */