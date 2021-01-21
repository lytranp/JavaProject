import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile 
{
    public static void main(String[] args) 
    {
        Scanner file = null; // initialize file = empty
        try
        {
            //file = new Scanner(new FileInputStream("test.txt")); // used to test catch
            file = new Scanner(new FileInputStream("file.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("We are sorry. File not found");
            System.exit(0);
        }

        // If file is found, the file was opened successfully
        String name;

        System.out.println("Whether there is data to read: " + file.hasNextLine()); // we wanna know if we have reached the end of the file -> this method determine if there is data to read; return Boolean
        name = file.nextLine();
        double score = file.nextDouble();

        System.out.println("File contains 1st line: " + name);
        System.out.println("File contains 2nd line: " + score);

        System.out.println("Text left to read?: " + file.hasNextLine());

        file.close(); //release any resources that have been allocated by Java
    }
    
}
