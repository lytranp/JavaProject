import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) 
    {
        int n1, n2;
        Scanner object = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        n1 = object.nextInt(); // method nextInt read one int from keyboard
        n2 = object.nextInt();
        System.out.println("You entered " + n1 + " and " + n2); // echo input: write to the screen all input that program receives from the keyboard

        double n3, n4;
        System.out.println("Enter 2 decimal numbers");
        n3 = object.nextDouble();
        n4 = object.nextDouble();
        System.out.println("You entered " + n3 + " and " + n4);

        String word1, word2;
        System.out.println("Enter 2 words");
        word1 = object.next(); // next method read: a word: is a string without whitespace, delimited by whitespace like blanks
        word2 = object.next();
        System.out.println("You entered " + word1 + " and " + word2);

        /*next Method only read word2 but not read \n. 
        => nextLine Method will read the rest of line word2, meaning read \n
        That is reason s1 = object.nextLine() returns the empty string because it read \n 
        and s2 = object.nextLine() really begins to read entire line user input.
        So, when combining different methods for reading from keyboard, 
        sometimes have to include extra nextLine() to get rid of the end of the previous line \n
        => Here, we include extra String junk = object.nextLine()
        */
        String junk = object.nextLine(); // get rid of \n; must have to input line later

        System.out.println("Enter a line of text: ");
        String s1 = object.nextLine();
        String s2 = object.nextLine();
        System.out.println("You entered: \"" + s1 + "\" ");
        System.out.println("You entered: \"" + s2 + "\" ");

        System.out.println("Enter number of items purchased");
        System.out.println("And its price");
        int count = object.nextInt();
        double price = object.nextDouble();
        double total = count * price;

        System.out.printf("Number of items are: %d and its price is: %.2f %n", count, price);
        System.out.printf("Total amount is: $ %.2f", total);
        } 
}
