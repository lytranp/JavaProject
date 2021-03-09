import java.util.Scanner;

public class While {
    public static void main(String[] args) 
    {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter a list of nonnegative scores, a negative number marks the end: ");

        double next, sum = 0;
        int count = 0;

        next = object.nextDouble();
        while(next >= 0)
        {
            sum += next; 
            count += 1;
            next = object.nextDouble();
        }

        if (count == 0)
            System.out.println("no scores entered");
        else
        {
            double average = sum / count;
            System.out.println("The average is: " + average);
        }

    }
    
}
