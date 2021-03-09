public class WhileAndDoWhile {
    public static void main(String[] args) 
    {
        // While statement
        int countDown = 3;
        System.out.println("Using while statement");
        while (countDown > 0)
        {
            System.out.println("Hello");
            countDown -= 1; 
        }

        // Using do-while
        int countDown2 = 3;
        System.out.println("Using do-while statement");
        do
        {
            System.out.println("Hello");
            countDown2 -= 1;
        } while (countDown2 > 0);
    }
    
}
