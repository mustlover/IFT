//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program to run class LA315Triangle
//Date: 4/1/18
//******************************************

import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;


public class LA315TestTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("A triangle has three sides, A, B, and C, \nwhere A is the height" +
                ", B is the base, and C is the hypotenuse. \nFind angle alpha which is " +
                "the angle between B and C. ");

       LA315Triangle triangle = new LA315Triangle();

        System.out.println("\nPlease enter in side A: ");
        double sideA = scan.nextDouble();
        triangle.setSideA(sideA);
        System.out.println("Please enter in side B: ");
        double sideB = scan.nextDouble();
        triangle.setSideB(sideB);
        scan.close();

        DecimalFormat fmt = new DecimalFormat("0.00");

        System.out.println("The hypotenuse is: " + (fmt.format(triangle.getHypotenuse())));
        System.out.println("Angle alpha is: " + (fmt.format(triangle.getAlpha())));

        System.out.println("\n-----END PROGRAM-----");
    }
}

/* ---------------PROGRAM OUTPUT

A triangle has three sides, A, B, and C,
where A is the height, B is the base, and C is the hypotenuse.
Find angle alpha which is the angle between B and C.

Please enter in side A:
12
Please enter in side B:
10
The hypotenuse is: 15.62
Angle alpha is: 50.19

-----END PROGRAM-----

 */
