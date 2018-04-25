import java.text.DecimalFormat;

public class CheckPrinter {


    void printTheCheck(IPayable payable)
    {
        DecimalFormat fmt = new DecimalFormat("$#, ##0.00");

        System.out.println("Here is your check:");
        System.out.println("\n\tPay to the Order of: " + payable.getPayableName());
        System.out.println("\tIn The Amount Of: " + fmt.format(payable.getAmount()));
        System.out.println();

    }
}
