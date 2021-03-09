import java.util.Scanner;

public class StockValue {
    public static void main(String[] args) 
    {

        String companyName;
        String stockSymbol;
        double dividend;
        int ownedShares;
        double paidPrice;
        double currentPrice;
        int purchaseShares;

        double purchasedValue = 0;
        double currentValue = 0;
        double gainLoss = 0;
        double dividendYield = 0;
        double dividendPayOut = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of the company: ");
        companyName = keyboard.nextLine().toUpperCase();

        System.out.print("Enter the stock ticker symbol: ");
        stockSymbol = keyboard.next().toUpperCase();
        
        while (stockSymbol.length() < 2 || stockSymbol.length() > 4)
        {
        	System.out.print("Stock ticker symbol must be 2 to 4 characters in length. You entered " + stockSymbol + " Please re-enter...");
        }
        	

        System.out.print("Enter annual dividends paid out per share of " + companyName + " stock: ");
        dividend = keyboard.nextDouble();
        
        if (dividend == 0)
        {
            System.out.print("Enter the number of " + companyName + " shares you currently own: ");
            ownedShares = keyboard.nextInt();
            if (ownedShares == 0)
            {
                System.out.print("Enter how many shares of " + companyName + " do you want to purchase: ");
                purchaseShares = keyboard.nextInt();
                System.out.print("Enter the current market price for the " + companyName + " stock: ");
                currentPrice = keyboard.nextDouble();
                currentValue = currentPrice * purchaseShares;
                System.out.println();
                System.out.println("Stock Value Output");
                System.out.println("----------------------------------");
                System.out.printf("To purchase " + purchaseShares + "(s) of " + companyName + " (" + stockSymbol + ") stock: $ %.2f", currentValue);
                System.out.println();
                System.out.println("Annual dividend yield for " + companyName + " (" + stockSymbol + ") stock: N/A");
            }
            else
            {
                System.out.print("Enter the price you paid per share for the " + companyName + " stock: ");
                paidPrice = keyboard.nextDouble();
                System.out.print("Enter the current market price for the " + companyName + " stock: ");
                currentPrice = keyboard.nextDouble();
                purchasedValue = ownedShares * paidPrice;
                currentValue = ownedShares * currentPrice; 
        		gainLoss = currentValue - purchasedValue;
                System.out.println();
        		System.out.println("Stock Value Output");
        		System.out.println("----------------------------------");
        		System.out.printf("Purchased value of " + ownedShares + "(s) of " + companyName + "(" + stockSymbol + ") stock: $ %.2f", purchasedValue);
        		System.out.println();
        		System.out.printf("Current value of " + ownedShares + "(s) of " + companyName + "(" + stockSymbol + ") stock: $ %.2f", currentValue);
        		System.out.println();
        		System.out.printf("Gain or loss of " + ownedShares + "(s) of " + companyName + "(" + stockSymbol + ") stock: $ %.2f", gainLoss);
        		System.out.println();
                System.out.println("Annual dividend yield for " + companyName + " (" + stockSymbol + ") stock: N/A");
            }
        }
 
        else
        {
            
        	System.out.print("Enter the number of " + companyName + " shares you currently own: ");
        	ownedShares = keyboard.nextInt();
        
        	if (ownedShares == 0)
        	{
        		System.out.print("Enter how many shares of " + companyName + " do you want to purchase: ");
        		purchaseShares = keyboard.nextInt();
        		System.out.print("Enter the current market price for the " + companyName + " stock: ");
        		currentPrice = keyboard.nextDouble();
        		currentValue = currentPrice * purchaseShares;
        		dividendYield = (dividend / currentPrice) * 100;
        		dividendPayOut = purchaseShares * dividend;
            
        		System.out.println();
        		System.out.println("Stock Value Output");
        		System.out.println("----------------------------------");
        		System.out.printf("To purchase " + purchaseShares + "(s) of " + companyName + " (" + stockSymbol + ") stock: $ %.2f", currentValue);
        		System.out.println();
        		System.out.printf("Annual dividend paid out per share for " + companyName + " (" + stockSymbol + ") stock: $ %.2f", dividend);
        		System.out.println();
        		System.out.printf("Annual dividend yield for " + companyName + " (" + stockSymbol + ") stock: %.3f", dividendYield);
        		System.out.println();
        		System.out.printf("Annual dividend payout of " + purchaseShares + "(s) of "+ companyName + " (" + stockSymbol + ") stock: $ %.2f", dividendPayOut);
            
        	}
        	else 
        		{
        		System.out.print("Enter the price you paid per share for the " + companyName + " stock: ");
        		paidPrice = keyboard.nextDouble();
        		System.out.print("Enter the current market price for the " + companyName + " stock: ");
        		currentPrice = keyboard.nextDouble();
        		purchasedValue = ownedShares * paidPrice;
        		currentValue = ownedShares * currentPrice; 
        		gainLoss = currentValue - purchasedValue;
        		dividendYield = (dividend / currentPrice) * 100;
        		dividendPayOut = ownedShares * dividend;

        		System.out.println();
        		System.out.println("Stock Value Output");
        		System.out.println("----------------------------------");
        		System.out.printf("Purchased value of " + ownedShares + "(s) of " + companyName + "(" + stockSymbol + ") stock: $ %.2f", purchasedValue);
        		System.out.println();
        		System.out.printf("Current value of " + ownedShares + "(s) of " + companyName + "(" + stockSymbol + ") stock: $ %.2f", currentValue);
        		System.out.println();
        		System.out.printf("Gain or loss of " + ownedShares + "(s) of " + companyName + "(" + stockSymbol + ") stock: $ %.2f", gainLoss);
        		System.out.println();
        		System.out.printf("Annual dividend paid out per share for " + companyName + "(" + stockSymbol + ") stock: $ %.2f", dividend);
        		System.out.println();
        		System.out.printf("Annual dividend yield for " + companyName + "(" + stockSymbol + ") stock: $ %.2f", dividendYield);
        		System.out.println();
        		System.out.printf("Annual dividend payout of " + ownedShares + "(s) of "+ companyName + "(" + stockSymbol + ") stock: $ %.2f", dividendPayOut);
        		}
        	}
        
    	}
	}

/*

1. Enter name of company: String companyName
2. Enter the stock ticker symbol: String stockSymbol
3. Enter annual dividends per share: double dividend 
    if (dividend > 0)

    else
        print("N/A")
4. Enter # of shares: int numberOfShares
    if (numberOfShares > 0)
        print("Enter paid price")
            5. Paid price: double paidPrice
    else
        print("Enter how many shares do you want to purchase")
6. Current market price: double currentPrice

Print:
- Purchased value of [numberOfShares] of [companyName] (stockSymbol): numberOfShares * paidPrice
- Current value: numberOfShares * currentPrice
- Gain/Loss: (numberOfShares * currentPrice) - (numberOfShares * paidPrice)
- Annual dividend paid out: dividend
- Annual dividend yield: (dividend / currentPrice) * 100
- Annual dividend pay out: numberOfShares * dividend




*/


/*
Overall variables:
1. Enter name of company: String companyName
2. Enter the stock ticker symbol: String stockSymbol
3. Enter annual dividends per share: double dividend 
    if (dividend == 0)
        enter: number of shares :
        ownedShares = keyboard.Int()
        enter: market price:
        currentPrice = ....
        Print:
        - To purchase....
        - Annual dividend : N/A
    else 
        Enter # of shares: int ownedShares
        if (ownedShare == 0)
            enter: number of shares they want to purchase: 
            purchasedShares = keyboard.int()
            enter: current market price
            currentPrice = keyboard.nextDouble()
            COMPUTATION
            print:
            - To purchase.....
            - Annual dividend....
        else 
             enter: name of company


Print:
- Purchased value of [numberOfShares] of [companyName] (stockSymbol): numberOfShares * paidPrice
- Current value: numberOfShares * currentPrice
- Gain/Loss: (numberOfShares * currentPrice) - (numberOfShares * paidPrice)
- Annual dividend paid out: dividend
- Annual dividend yield: (dividend / currentPrice) * 100
- Annual dividend pay out: numberOfShares * dividend




*/