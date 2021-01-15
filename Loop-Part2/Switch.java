import java.util.Scanner;

public class Switch 
{
    public static void main(String[] args) 
    {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter number of ice cream flavors: ");
        int numberOfFlavors = object.nextInt( );

        switch (numberOfFlavors) // Controlling expression
        {
            case 1:
                System.out.println("It is vanilla flavor");
                break;
            case 2:
                System.out.println("It is chocolate flavor");
                break;
            default:
                System.out.println("You did not choose correctly");
                break;
        }
    }
    
}

