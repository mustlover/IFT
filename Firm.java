// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Firm.java
// Date: 4/15/18
// The is the program that runs the classes Commission.java,
// Employee.java, Executive.java, Hourly.java, Staff.java,
// StaffMember.java, and Volunteer.java. This programs
// prints out the list of employees, their information, and
// pay.
// ************************************************************

public class Firm {

	//creates a staff of employees for a firm and pay them
	
	public static void main(String[] args) 
	{
		Staff personnel = new Staff();
		personnel.payday();
		System.out.println("\n---END PROGRAM---");
	}

}


/* -----------PROGRAM OUTPUT-----------

Name: Sam Watershed
Address: 123 Main Avenue
Phone: 555-0469

Social Security Number: 123-45-6789
Paid: $7,423.07
 --------------------------------------
Name: Rose Franklin
Address: 456 Ridge Way
Phone: 555-4567

Social Security Number: 568-43-7535
Paid: $1,246.15
 --------------------------------------
Name: Peter O'Toon
Address: 3456 Pine Nut Street
Phone: 555-1596

Social Security Number: 654-32-9685
Paid: $1,169.23
 --------------------------------------
Name: Jamie Cookshank
Address: 1245 Rusty Bay Lane
Phone: 555-7532

Social Security Number: 254-85-7412
Current hours: 40
Paid: $422.00
 --------------------------------------
Name: Lulu Nightly
Address: 541 Alpine Drive
Phone: 555-8521

Thanks!
 --------------------------------------
Name: Frank Peters
Address: 985 Rosewood Boulevard
Phone: 555-1967

Thanks!
 --------------------------------------
Name: Adrian Michaels
Address: 1584 Grey Parkway
Phone: 555-9464

Social Security Number: 987-654-3212
Current hours: 35
Total Sales: $400.00
Paid: $8,218.75
 --------------------------------------
Name: Travis Vancoover
Address: 985 Rosewood Boulevard
Phone: 555-0015

Social Security Number: 951-753-1793
Current hours: 40
Total Sales: $950.00
Paid: $14,640.00
 --------------------------------------

---END PROGRAM---
*/