import java.util.Scanner;

public class YahtzeeGame 
{
    public static void main(String[] args) 
    {
        int[] Dice = new int[5];  
        
        System.out.println("=".repeat(50));
        System.out.println("\t\t\t FIRST ROLL \t\t\t");
        System.out.println("\t\t\t " + "-".repeat(50));

        firstDiceRoll(Dice);
        displayDice(Dice);
        reRollDice(Dice);
        String rollCategory = rolledResults(Dice);
        System.out.println(rollCategory);
    }

    // Generate 5 random values
    // Store these values into Dice array
    // Parameter: array 
    public static void firstDiceRoll(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 6);
        }
    }

    public static void displayDice(int[] array)
    {
        System.out.println("\t\t\t Dice1 \t Dice2 \t Dice3 \t Dice4 \t Dice5 \t\t\t");
        System.out.print("\t Dice Values: ");

        for (int idx = 0; idx < array.length; idx++)
        {
            System.out.print("\t   " + array[idx]);
        }
        System.out.println();
        System.out.println("=".repeat(100));
    }

    public static void reRollDice(int[] array)
    {

        Scanner keyboard = new Scanner(System.in);
        int reRollCount = 1;
        char reRoll;
        String reRollTimes;

        System.out.print("Do you want to re-roll some of the dice(Yy/Nn): ");
        reRoll = keyboard.nextLine().toLowerCase().charAt(0);
        System.out.println("=".repeat(100));
        System.out.println();

        while (reRoll == 'y' && reRollCount < 3)
        {
            System.out.print("Re-Roll Dice 1(Yy/Nn): ");
            char reRoll1 = keyboard.nextLine().toLowerCase().charAt(0);
            System.out.print("Re-Roll Dice 2(Yy/Nn): ");
            char reRoll2 = keyboard.nextLine().toLowerCase().charAt(0);
            System.out.print("Re-Roll Dice 3(Yy/Nn): ");
            char reRoll3 = keyboard.nextLine().toLowerCase().charAt(0);
            System.out.print("Re-Roll Dice 4(Yy/Nn): ");
            char reRoll4 = keyboard.nextLine().toLowerCase().charAt(0);
            System.out.print("Re-Roll Dice 5(Yy/Nn): ");
            char reRoll5 = keyboard.nextLine().toLowerCase().charAt(0);

            if (reRoll1 == 'y') 
                array[0] = (int)(Math.random() * 6);
            
            if (reRoll2 == 'y') 
                array[1] = (int)(Math.random() * 6);
    
            if (reRoll3 == 'y') 
                array[2] = (int)(Math.random() * 6);

            if (reRoll4 == 'y') 
                array[3] = (int)(Math.random() * 6);

            if (reRoll5 == 'y')
                array[4] = (int)(Math.random() * 6);
        
            reRollCount += 1;
            if (reRollCount == 2)
                reRollTimes = "SECOND";
            else
                reRollTimes = "THIRD";
            
            System.out.println("=".repeat(100));
            System.out.println("\t\t\t " + reRollTimes + " ROLL");
            System.out.println("\t\t\t " + "-".repeat(50));

            displayDice(array);

            if (reRollCount < 3)
            {
                System.out.print("Do you want to re-roll some of the dice(Yy/Nn): ");
                reRoll = keyboard.nextLine().toLowerCase().charAt(0);
                System.out.println("=".repeat(100));
                System.out.println();
            }     
        } 
        System.out.print("Results: ");
        for (int idx = 0; idx < array.length; idx++)
        {
            System.out.print(" " + array[idx]);
        }
            System.out.print(" ");
    }

    // Check the occurrence of a specific dice value in a Dice array
    // return int
    private static int[] occurrenceCount(int[] Dice)
    {
        /* Count occurence of all of dice values in Dice array
        and store occurrence in freqCount
        */

        int[] diceValues = {1, 2, 3, 4, 5, 6};
        int[] freqCount = new int[6];

        for (int v = 0; v < diceValues.length; v++)
        {
            int count = 0;
            for (int d = 0; d < Dice.length; d++)
            {
                if (diceValues[v] == Dice[d])
                    count += 1;
            }
            freqCount[v] = count;
        }

        return freqCount;
    }


    /* Find the max value in freq Count
    */
    private static int occurenceMax(int[] Dice)
    {

        int[] freqCount = occurrenceCount(Dice);
        int maxNumber = freqCount[0];
        for (int f = 1; f < freqCount.length; f++)
        {
            if (freqCount[f] > maxNumber)
                maxNumber = freqCount[f];
        }

        return maxNumber;
    }

    private static boolean isFullHouse(int[] Dice)
    {
        int[] freqCount = occurrenceCount(Dice);

        boolean isFullHouse = false;
        int sum = 0;
        int i = 0;
        while (i < freqCount.length)
        {
            if (freqCount[i] == 3 || freqCount[i] == 2)
                sum += freqCount[i];
            i ++;
        }
        
        if (sum == 5)
            isFullHouse = true;
        else
            isFullHouse = false;
        
        return isFullHouse;
    }

    private static int Straight(int[] Dice)
    {
        int count = 1;
        for(int d = 0; d < Dice.length - 1; d++)
        {
            if (Dice[d+1] - Dice[d] == 1)
                count += 1;
        }
        return count;
    }

    private static int addUp(int[] Dice)
    {
        int sum = 0;
        for(int d = 0; d < Dice.length; d++)
        {
            sum += Dice[d];
        }
        return sum; 
    }

    public static String rolledResults(int[] array)
    {
        String rollType = "";

        int maxFrequency = occurenceMax(array);
        boolean FullHouse = isFullHouse(array);
        int straightNumber = Straight(array);
        int addUp = addUp(array);

        if (maxFrequency == 5)
            rollType = "Yahtzee";
        else if (maxFrequency == 4)
            rollType = "4 of a kind";
        else if (FullHouse == true)
            rollType = "Full House";
        else if (maxFrequency == 3)
            rollType = "3 of a kind";
        else if (straightNumber == 4)
            rollType = "Small Straight";
        else if (straightNumber == 5)
            rollType = "Large Straight";
        else 
            rollType = String.format("Chance (%d)", addUp);

        return rollType;
    }
}
