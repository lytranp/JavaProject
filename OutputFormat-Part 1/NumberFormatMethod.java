/* Output amount of money according to country
*/
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMethod {

    public static void main(String[] args)
    {
        NumberFormat money = NumberFormat.getCurrencyInstance(); // Default location is US
        System.out.println(money.format(19.8)); // format method take float number; return String value
        System.out.println(money.format(19.911111)); //Automatically assign $ before number 

        System.out.println("China as location");
        NumberFormat money2 = NumberFormat.getCurrencyInstance(Locale.CHINA); // Change currency to China
        System.out.println(money2.format(19.8));
    }
    
}
