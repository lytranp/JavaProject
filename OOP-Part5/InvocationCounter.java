public class InvocationCounter 
{
    private static int numberOfInvocations = 0;

    public void demoMethod()
    {
        numberOfInvocations++;
    }

    public void outPutCount()
    {
        numberOfInvocations++;
        System.out.println("Number of invocations so far is: " + numberOfInvocations);
    }

    public static int numberSoFar()
    {
        numberOfInvocations++;
        return numberOfInvocations;
    }

    public static void main(String[] args) 
    {
        InvocationCounter object1 = new InvocationCounter();
        for (int i = 1; i <= 2; i++)
        {
            object1.demoMethod();
            object1.outPutCount();
        } 

        System.out.println("Total number of invocations = " + numberSoFar());
        
    }
}
