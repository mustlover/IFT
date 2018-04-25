// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: BandSales.java
// Date: 4/1/18
// The is the program that runs the BandBooster.java class
// asking the user to enter in two different names of students
// who are band boosters and then asking how many candies each
// one sold in three weeks.
// ************************************************************

import java.util.Scanner;

public class BandSales {

    public static void main(String[] args) {

        String name1, name2;
        int num1, num2;
        BandBooster bb1, bb2;

        Scanner scan = new Scanner(System.in);

        // prompts user to input and reads the names of the band booster students
        System.out.println("Please enter the name of the first band booster: ");
        name1 = scan.nextLine();

        System.out.println("Please enter the name of the second band booster: ");
        name2 = scan.nextLine();

        // creates a new band booster to store information
        bb1 = new BandBooster(name1, 0);
        bb2 = new BandBooster(name2, 0);

        // prompts user and reads in how many boxes were sold each week for band booster 1
        System.out.println("\nHow many boxes did " + name1 + " sell in the first week: ");
        num1 = scan.nextInt();
        bb1.updateSales(num1); // updates the count

        System.out.println("In the second week: ");
        num1 = scan.nextInt();
        bb1.updateSales(num1);//updates the count

        System.out.println("And in the third week: ");
        num1 = scan.nextInt();
        bb1.updateSales(num1); // updates the count

        // prompts user and reads in how many boxes were sold each week for band booster 2
        System.out.println("\nHow many boxes did " + name2 + " sell in the first week: ");
        num2 = scan.nextInt();
        bb2.updateSales(num2); // updates the count

        System.out.println("In the second week: ");
        num2 = scan.nextInt();
        bb2.updateSales(num2); // updates the count

        System.out.println("And in the third week: ");
        num2 = scan.nextInt();
        bb2.updateSales(num2); // updates the count


        // prints out the band boosters name and
        // how many boxes of candies were sold in a three week period.
        System.out.println("\n---------------Band Booster Summary---------------");
        System.out.println(bb1);
        System.out.println(bb2);

        System.out.println("\n-----End Program-----");
    }
}

/*--------------------PROGRAM OUTPUT--------------------
Please enter the name of the first band booster:
Mary
Please enter the name of the second band booster:
Paul

How many boxes did Mary sell in the first week:
12
In the second week:
45
And in the third week:
78

How many boxes did Paul sell in the first week:
32
In the second week:
65
And in the third week:
98

---------------Band Booster Summary---------------
Mary sold a total of 135 boxes in 3 weeks.
Paul sold a total of 195 boxes in 3 weeks.

-----End Program-----

Process finished with exit code 0
 */
