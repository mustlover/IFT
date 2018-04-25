import java.text.DecimalFormat;

public class Employees implements Comparable<Employees>
{

    //attributes
    private String fName;
    private String lName;
    private double salary;

    //constructors

    public Employees() {
        fName = "unknown";
        lName = "unknown";
        salary = 0.0; //for doubles always input the .0
    }

    public Employees(String fName, String lName, double salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    //behaviors
    public double calcuatePay()
    {
        return salary / 26.0;
    }

    @Override
    public String toString() {

        DecimalFormat formatter = new DecimalFormat("$#, ##0.00");

        return "Employee: " + '[' + "LName: '" + lName + '\'' + ", FName: '" + fName + '\'' +
                ", Salary: " + formatter.format(salary) + ']';
    }

    @Override
    public int compareTo(Employees o) { //o = other
        //show Java how to sort the objects
        String thisFullName = this.lName + this.fName;
        String oFullName = o.lName + o.fName;
        return thisFullName.compareTo(oFullName);
    }

    //getters and setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}