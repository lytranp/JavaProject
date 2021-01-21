public class StringEqual 
{
    public static void main(String[] args) 
    {
        String s1 = "ha";
        String s2 = "HA";

        if (s1.equalsIgnoreCase(s2))
            System.out.println("2 words are the same");
        else
            System.out.println("2 words are different");

        int n1 = 5;
        int n2 = 10;
        
        double max = (n1 > n2) ? n1 : n2;
        System.out.println("The result is: " + max);

        String s3 = "ly tran";
        String s4 = "ha nguyen";
        if (s3.compareToIgnoreCase(s4) < 0)
            System.out.println(s3 + " precedes " + s4);
        else if (s3.compareToIgnoreCase(s4) > 0)
            System.out.println(s3 + " precedes " + s4);
        else 
            System.out.println(s3 + " is equal " + s4);
    }
    
}
