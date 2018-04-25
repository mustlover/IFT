import java.util.Vector;
import java.util.Collections;

public class Launcher {

    public static void main(String[] args) {

        //create a vector - resizable array
        Vector<Employees> employees = new Vector<Employees>();
        employees.add(new Employees("Jack", "Black", 86941.13));
        employees.add(new Employees("Amy", "Wilson", 86941.13));
        employees.add(new Employees("Tanya", "Harding", 86941.13));
        employees.add(new Employees("Jeff", "Stone", 86941.13));
        employees.add(new Employees("Zack", "Efron", 86941.13));
        employees.add(new Employees("Lizza", "Minelli", 86941.13));
        employees.add(new Employees("Chris", "Tucker", 86941.13));
        employees.add(new Employees("Franklin", "Tucker", 86941.13));
        employees.add(new Employees("Abby", "Harding", 86941.13));
        employees.add(new Employees("Theresa", "Black", 86941.13));


        //sort the names
        Collections.sort(employees);

        //display the employees
        for(Employees emp : employees)
        {
            System.out.println(emp.toString());
        }

    }
}
