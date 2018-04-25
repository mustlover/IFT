// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Hourly.java
// Date: 4/15/18
// The is the class for program Firm.java. This class sets up to read in
// hourly information
// ************************************************************

public class Hourly extends Employee
{
	private int hoursWorked;
	
	//constructor set up this employee with the specific information
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
	}
	
	//adds the specified number of hours to this employees accumulated hours
	public void addHours(int moreHours)
	{
		hoursWorked += moreHours;
	}
	
	
	//computes and returns the pay for this hourly employee
	public double pay()
	{
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	
	//returns information about this hourly employee as a string
	public String toString()
	{
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;
	}
}
