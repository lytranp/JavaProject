/* Compute income tax */
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args)
     {
        Scanner keyboard = new Scanner(System.in);
        double netIncome, tax, fivePercentTax, tenPercentTax;
        int BASIC_INCOME = 15000;

        System.out.println("Enter net income: ");
        netIncome = keyboard.nextDouble();

        if (netIncome <= BASIC_INCOME)
        {
            tax = 0;
        }
        else if ((netIncome > BASIC_INCOME) && (netIncome <= BASIC_INCOME))
        {
            tax = 0.05 * (netIncome - BASIC_INCOME); // tax = 5% on amount over 15000
        }
        else 
        {
            fivePercentTax = 0.05 * 15000;
            tenPercentTax = 0.10 * (netIncome - 30000);
            tax = fivePercentTax + tenPercentTax;
        }

        System.out.printf("Tax is: $ %.2f", tax);
    }
    
}
