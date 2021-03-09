import java.util.Scanner; 

public class VolumeDiscounts 
{
    public static void main(String[] args) 
    {
    int first15Items = 15;
    int next10Items = 10;
     
    double below15ItemsPrice = 5.15; //in dollars
    double next10ItemsPrice = 4.75;
    double above25ItemsPrice = 3.75;

    System.out.println("This program prints the total cost of a purchase");
    System.out.print("Enter the number of items purchased: ");
    Scanner keyboard = new Scanner(System.in);
    int itemNumber = keyboard.nextInt();     
    
    double totalCost;
    if (itemNumber < first15Items)
        totalCost = itemNumber * below15ItemsPrice;
    else if (itemNumber <= (first15Items + next10Items))
        totalCost = first15Items * below15ItemsPrice
                + (itemNumber - first15Items) * next10ItemsPrice;
    else 
        totalCost = first15Items * below15ItemsPrice
                    + next10Items * next10ItemsPrice
                    + (itemNumber - first15Items - next10Items) * above25ItemsPrice;
                
    System.out.printf("The total purchase price is: $%.2f", totalCost);
    }
}
