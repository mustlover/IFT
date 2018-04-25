public class CheckPrinterTest {
    public static void main(String[] args) {

        //create an employee object and pay the person
        Employee emp = new Employee("Jack", "Smith", 98427.13);

        //pay the person
        CheckPrinter print = new CheckPrinter();
        print.printTheCheck(emp);

        //pay the vendor
        Vendor vend = new Vendor("IMB", 12500);
        print.printTheCheck(vend);

    }
}


/*-----------------PROGRAM OUTPUT-----------------

Here is your check:

	Pay to the Order of: Jack Smith
	In The Amount Of: $3,785.66

Here is your check:

	Pay to the Order of: IMB
	In The Amount Of: $12,500.00


 */
