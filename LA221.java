//******************************************
//Lecture Activities Week 2
//Author: Suzanne Kaufman
//Date: 3/25/18
//******************************************
import java.util.Scanner;

public class LA221 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to add? (1-100): ");

        int size = Integer.parseInt(scan.nextLine());

        int[] num = new int[size]; //creates new array

        System.out.println("Please enter your numbers: \n(hit return after each entry or \nput a space between each number): ");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = scan.nextInt(); //collects numbers
        }

        scan.close();

        //calculate the average
        int total = 0;

        for (int i = 0; i < num.length; i++)
        {
            total = total + num[i];
        }

        float average = total / num.length; //adds numbers and get average

        //count the number of items in the average
        int count = 0;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] > average)
                count++;  // increases count
        }

        System.out.println("\n Average: " + average); //prints the average of all numbers entered
        //calculates how many items entered are more than the average
        System.out.println("The number of elements in the above average is: " + count);

        //end program
        System.out.println("\nEnd Program. Thank you!");
    }
}
