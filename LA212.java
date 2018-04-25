//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************

import java.util.Scanner;

public class LA212 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the radius (decimal number): ");
        double radius = scan.nextDouble();
        scan.close(); //closes scan

        if (radius >= 0) //calculates the area of a circle based on input
        {
            //Area = PI*radius*radius
            double area = Math.PI * (radius * radius);
            System.out.println("The area of a circle with the radius of " + radius + ", is " + area);
        }
        if(radius < 0)//tells user they inputted a negative number
        {
            System.out.println("Negative input!");
        }

        //end of program
        System.out.println("\nEnd of program.");

    }
}
