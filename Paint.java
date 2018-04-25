//***************************************************************
// Author: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// Date: 3/25/18
// File: Paint.java
// Purpose: Determine how much paint is needed to paint the walls
// of a room given its length, width, and height
// ***************************************************************

import java.util.Scanner;

public class Paint {

    public static void main(String[] args) {

        final int COVERAGE = 350; //paint covers 350 sq ft/gal

        final int DOORSQFT = 20; //square footage per door

        final int WINSQFT = 15; //square footage per window

        // declare integers length, width, and height;
        int length, width, height;

        // declare double totalSqFt;
        double totalSqFt;

        //declare the doors
        int door;

        // declare the windows
        int window;

        // declare double paintNeeded;
        double paintNeeded;

        // declare and initialize Scanner object
        Scanner scan = new Scanner(System.in);

        // Prompt for and read in the length of the room
        System.out.println("Please enter in the length of the room: ");
        length = scan.nextInt();

        // Prompt for and read in the width of the room
        System.out.println("Please enter the width of the room: ");
        width = scan.nextInt();

        // Prompt for and read in the height of the room
        System.out.println("Please enter the height of the room: ");
        height = scan.nextInt();

        // Prompt for and read in the number of doors
        System.out.println("Please enter the number of doors in the room: ");
        door = scan.nextInt();

        // Prompt for and read in the number of windows
        System.out.println("Please enter the number of windows in the room: ");
        window = scan.nextInt();

        // Compute the total square feet to be painted--think
        // about the dimensions of each wall
        totalSqFt = ((length * 2) + (width * 2)) * height;

        //Compute the total square feet to be painted
        //minus the sqft of the windows and doors
        totalSqFt = totalSqFt - (WINSQFT * window) - (DOORSQFT * door);

        // Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;

        // Print the length, width, and height of the room.
        System.out.println("The length of the room is " + length + " ft.");
        System.out.println("The width of the room is " + width + " ft.");
        System.out.println("The height of the room is " + height + " ft.");

        //Print the doors and windows
        System.out.println("You have " + door + " doors and " + window + " windows in your project.");

        //Print the number of gallons of paint needed.
        System.out.println("\nThe amount of paint needed for the project is " + paintNeeded + " gallons." );
    }
}

/*
*******************************PROGRAM OUTPUT******************************************
Please enter in the length of the room:
12
Please enter the width of the room:
10
Please enter the height of the room:
8
Please enter the number of doors in the room:
2
Please enter the number of windows in the room:
2
The length of the room is 12 ft.
The width of the room is 10 ft.
The height of the room is 8 ft.
You have 2 doors and 2 windows in your project.

The amount of paint needed for the project is 0.8057142857142857 gallons.

 **************************************************************************************
 */