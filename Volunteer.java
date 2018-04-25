// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Volunteer.java
// Date: 4/15/18
// The is the class for program Firm.java. This class sets up to read in
// volunteers information
// ************************************************************

public class Volunteer extends StaffMember
{

	//constructor sets up this volunteer using the specified information
	public Volunteer(String eName, String eAddress, String ePhone)
	{
	super(eName, eAddress, ePhone);
	}
	
	//returns a zero pay value for this volunteer
	public double pay()
	{
		return 0.0;
	}
}