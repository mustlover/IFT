// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Staff.java
// Date: 4/15/18
// The is the class for program Firm.java. This class sets up to read in
// Each individual staff's information.
// ************************************************************

import java.text.DecimalFormat;

public class Staff
{

	private StaffMember[] staffList;

	//constructor sets up the list of staff members
	public Staff()
	{
		staffList = new StaffMember[8]; // 8 total staff members in the list

		staffList[0] = new Executive("Sam Watershed", "123 Main Avenue", "555-0469",
		"123-45-6789", 2423.07);

		staffList[1] = new Employee("Rose Franklin", "456 Ridge Way", "555-4567",
		"568-43-7535", 1246.15);

		staffList[2] = new Employee("Peter O'Toon", "3456 Pine Nut Street", "555-1596",
		"654-32-9685", 1169.23);

		staffList[3] = new Hourly("Jamie Cookshank", "1245 Rusty Bay Lane", "555-7532",
		"254-85-7412", 10.55);

		staffList[4] = new Volunteer("Lulu Nightly", "541 Alpine Drive", "555-8521");

		staffList[5] = new Volunteer("Frank Peters", "985 Rosewood Boulevard", "555-1967");

		staffList[6] = new Commission("Adrian Michaels", "1584 Grey Parkway", "555-9464",
		"987-654-3212", 6.25, 20);

		staffList[7] = new Commission("Travis Vancoover", "985 Rosewood Boulevard", "555-0015",
		"951-753-1793", 9.75, 15);

		((Executive)staffList[0]).awardBonus(5000.00);

		((Hourly)staffList[3]).addHours(40);

		((Commission)staffList[6]).addHours(35);
		((Commission)staffList[6]).addSales(400);

		((Commission)staffList[7]).addHours(40);
		((Commission)staffList[7]).addSales(950);

	}

	//Pays all staff members
	public void payday()
	{
	double amount;

		for (int count = 0; count < staffList.length; count++)
		{
			DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
			System.out.println(staffList[count]);

			amount = staffList[count].pay();

				if(amount ==0.0)
				System.out.println("Thanks!");
				else
				System.out.println("Paid: " + fmt.format(amount));

			System.out.println(" --------------------------------------");
		}
	}
}
