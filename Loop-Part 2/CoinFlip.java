/* Flip a coin 5 times. Each time records Head or Tail using random*/
import java.util.Random;

public class CoinFlip 
{
    public static void main(String[] args) 
    {
        Random randomGenerator = new Random();
        int counter = 1;

        while (counter <= 5)
        {
            System.out.print("Flip number " + counter + ": ");
            int coinFlip = randomGenerator.nextInt(2);
            if (coinFlip == 1)
                System.out.println("Head");
            else 
                System.out.println("Tail");
            counter++;

            // Method Math.random() does not require user to create object.
            // Return a random number in range 0 -> 1
            int num = (int)(Math.random() * 6);
            System.out.println(num);
        }
        
    }
    
}
