public class FormatPrintfMethod 
{
    public static void main(String[] args) 
    {
        String name = "hanguyen";
        double number = 12345.6789;

        System.out.printf("%s %n",name);
        System.out.printf("%4s %n", name);

        System.out.printf("%3.2f %n",number);
        System.out.printf("%2.3f ",number);
    }
}


