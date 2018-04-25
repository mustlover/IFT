// ************************************************************
// Name: Suzanne Kaufman
// File: Sales.java
// Class: IFT 194 B - Bird Lab2
// Date: 3/25/18
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
// ***************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Prompts user to enter and reads in number of sales persons
        System.out.print("Enter the number of sales people: ");
        int salespeople = scan.nextInt();
        int[] sales = new int[salespeople];
        int sum;
        int maxSalesPerson = 0;
        int maxSales = 0;
        int minSalesPerson = 0;
        int minSales = 0;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //Prompts user to enter and reads sales per sale person
        for (int i = 0; i < sales.length; i++)
        {
            System.out.print("Enter the sales for sales person " + (i + 1) + ": ");
            sales[i] = scan.nextInt();

            //Calculates which sales is highest and which is lowest
            if (i == 0)
            {
                minSales = sales[i];
                maxSales = sales[i];
            }

            //Identifies which sales person has the highest sale
            // and which sales person has the lowest sale
            if (sales[i] > maxSales)
            {
                maxSales = sales[i];
                maxSalesPerson = i;
            }
            if (sales[i] < minSales)
            {
                minSales = sales[i];
                minSalesPerson = i;
            }
        }

        //Prints out a chart of sales persons to sales
        System.out.println("\nSales person       Sales");
        System.out.println("--------------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++)
        {
            System.out.println("     " + (i +1) + "            " + currency.format(sales[i]));
            sum += sales[i];
        }

        //Prints out the total of all sales combined
        System.out.println("\nThe total of all sales is: " + currency.format(sum));

        //Prints out the average of all sales combined
        System.out.println("\nThe average of all sales is: " + currency.format(sum / salespeople));

        //Prints out which sales person has the highest sales and which has the lowest sales
        System.out.println("\nSales person " + maxSalesPerson + " had the highest sale with " + currency.format(maxSales));
        System.out.println("\nSales person " + minSalesPerson + " had the lowest sale with " + currency.format(minSales));

        //Prompts user to enter a sales number to see which sales person exceeded this number
        System.out.print("\nPlease enter a sales figure to see who exceeded it: \n");
        int exceed = scan.nextInt();
        int exceedCount = 0;

        //calculates and prints out which sales persons exceeded the number inputted by the user
        for(int i = 0; i < sales.length; i++)
        {
            if(sales[i] > exceed)
            {
                System.out.println("Sales person " + (i + 1) + " exceeded " + currency.format(exceed)
                        + " with sales of " + currency.format(sales[i]));
                exceedCount++;
            }
        }

        //Prints out how many sales persons exceeded the sales number entered by user
        System.out.println("\n" + exceedCount + " sales people exceeded " + currency.format(exceed));

        System.out.println("\n------------End Program------------");
    }
}

/*
********************************PROGRAM OUTPUT**************************************
        Enter the number of sales people: 5
        Enter the sales for sales person 1: 123
        Enter the sales for sales person 2: 456
        Enter the sales for sales person 3: 789
        Enter the sales for sales person 4: 654
        Enter the sales for sales person 5: 321

        Sales person       Sales
        --------------------------
        1            $123.00
        2            $456.00
        3            $789.00
        4            $654.00
        5            $321.00

        The total of all sales is: $2,343.00

        The average of all sales is: $468.00

        Sales person 2 had the highest sale with $789.00

        Sales person 0 had the lowest sale with $123.00

        Please enter a sales figure to see who exceeded it:
        500
        Sales person 3 exceeded $500.00 with sales of $789.00
        Sales person 4 exceeded $500.00 with sales of $654.00

        2 sales people exceeded $500.00

        ------------End Program------------

        Process finished with exit code 0
************************************************************************************
*/
