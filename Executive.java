// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Executive.java
// Date: 4/15/18
// The is the class for program Firm.java. This class sets up to read in
// executives information
// ************************************************************

public class Executive extends Employee
{
	private double bonus;
	
	//constructor set up this employee with the specific information
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		bonus = 0; // bonus has not yet been awarded
	}
	
	//Awards the specified bonus to this executive
	public void awardBonus(double execBonus)
	{
		bonus = execBonus;
	}

	//Computes and returns the rate for an executive, which is the regular employees payment plus a one time bonus
	public double pay()
	{
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
}
