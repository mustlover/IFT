// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Commission.java
// Date: 4/15/18
// The is the class for program Firm.java. This class sets up to read in
// a employees commission.
// ************************************************************

import java.text.DecimalFormat;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;


    //  Sets up this commission employee using the specified information.
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comm)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comm;
    }


    //  Adds the specified amount of sales to this employee's total sales.
    public void addSales(double sales)
    {
        totalSales += sales;
    }


    //  Computes and returns the pay for this commission employee.
    public double pay()
    {
        double payment = super.pay();
        payment += totalSales * commissionRate;
        totalSales = 0;
        return payment;
    }


    //  Returns information about this commission employee as a string.

    public String toString()
    {
        DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
        String result = super.toString();
        result += "\nTotal Sales: " + fmt.format(totalSales);
        return result;
    }
}


