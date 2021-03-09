/* This is an example of static variable */

public class TurnTaker 
{
    private static int turn = 0; 
    private int myTurn;
    private String name;

    public TurnTaker(String iniName, int iniTurn)
    {
        name = iniName;
        if (iniTurn >= 0)
            myTurn = iniTurn;
        else
        {
            System.out.println("Error");
            System.exit(0);
        }
    }

    public TurnTaker()
    {
        name = "No name yet";
        myTurn = 0;
    }

    public String getName()
    {
        return name;
    }

    public static int getTurn()
    {
        turn++; // we cannot access instance variable in static method, but can access static variable
        return turn;
    }
    
    public boolean isMyTurn()
    {
        return (turn == myTurn);
    }

    public static void main(String[] args) 
    {
        TurnTaker lover1 = new TurnTaker("A", 1);
        TurnTaker lover2 = new TurnTaker("B", 1);

        for (int i = 0; i < 5; i ++)
        {
            if (lover1.isMyTurn())
                System.out.println("Lover from " + lover1.getName());
            if (lover2.isMyTurn())
                System.out.println("Lover from " + lover2.getName());
            System.out.println("Turn = " + TurnTaker.getTurn());
        }
    }
}
