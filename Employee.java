// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Employee.java
// Date: 4/15/18
// The is the class for program Firm.java. This class sets up to read in
// employees information
// ************************************************************

public class Employee extends StaffMember
{
	protected String socialSecurityNumber;
	protected double payRate;
	

	//constructor set up this employee with the specific information
	
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) 
	{
		super(eName, eAddress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	
	//returns information about an employee as a string
	
	public String toString()
	{
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		
		return result;
	}

	//Returns the pay rate for this employee
	
	public double pay()
	{
		return payRate;
	}

}
