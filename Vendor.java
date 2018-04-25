public class Vendor implements IPayable
{

    //attributes
    private String companyName;
    private double amount;

    //constructors

    public Vendor() {
        companyName = "unknown";
        amount = 0.0; //for doubles always input the .0
    }

    public Vendor(String companyName, double amount) {
        this.companyName = companyName;
        this.amount = amount;

    }

    //behaviors
    public double calcuatePay()
    {
        return amount;
    }

    @Override
    public String getPayableName() {
        return companyName;
    }

    @Override
    public double getAmount() {
        return calcuatePay();
    }

    //getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
