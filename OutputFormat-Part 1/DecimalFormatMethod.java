import java.text.DecimalFormat;

public class DecimalFormatMethod
{
    public static void main(String[] args) 
    {
        DecimalFormat object = new DecimalFormat("000.0000"); // the pattern "000.0000" means that 3 digits before decimal point and 4 digits after decimal point
        String number = object.format(12.3456789); // format method convert float number, return String value
        System.out.println(number);

        DecimalFormat object2 = new DecimalFormat("#0.0##"); // #: indicate optional digit; #0.0##: 1 or 2 digits before decimal points and 1,2,or3 digits after decimal points
        System.out.println(object2.format(12.3456789));
    }
}
