import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class TextWordCounter 
{
    public void TextWordCount()
    {
        Scanner input = new Scanner(System.in);
        {
            String str;
            System.out.println("Enter the String: ");
            str = input.nextLine();

            char ch[] = str.toCharArray();
            int Words=0, Spaces=0, Number=0, Others=0;

            for(int i=0; i<str.length();i++)
            {
             if(Character.isLetter(ch[i]))
             {
                Words++;
             }   
             else if(Character.isSpaceChar(ch[i]))
             {
                Spaces++;
             }
             else if(Character.isDigit(ch[i]))
             {
                Number++;
             }
             else
             {
                Others++;
             }
            }
            System.out.println("Total String are: "+str);
            System.out.println("Total Words are: "+Words);
            System.out.println("Total Numbers are: "+Number);
            System.out.println("Total spaces are: "+Spaces);
            System.out.println("Other values are: "+Others);
        }

    }
    
}
class FileWordCounter
{
    static String path = "C:\\Users\\SYED SHAH FAHAD\\form\\assets\\Documents\\CodSoft Internship Task\\Input.txt";
    public void FileWordCount()
    {
        int Words=0, Spaces=0, Number=0,Others=0;
        char ch[];
        BufferedReader reader;
        try
        {
            reader = new BufferedReader(new FileReader(path));
            String str = reader.readLine();
            ch = str.toCharArray();
            for(int i=0;i<str.length();i++)
            {
               if(Character.isLetter(ch[i]))
             {
                Words++;
             }   
             else if(Character.isSpaceChar(ch[i]))
             {
                Spaces++;
             }
             else if(Character.isDigit(ch[i]))
             {
                Number++;
             }
             else
             {
                Others++;
             } 
            }
            System.out.println("Total String are: "+str);
            System.out.println("Total Words are: "+Words);
            System.out.println("Total Numbers are: "+Number);
            System.out.println("Total spaces are: "+Spaces);
            System.out.println("Other values are: "+Others);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();;
        }
    }
}
public class WordCounter
{
 public static void main(String args[])
 {
    int choice;
    TextWordCounter obj1 = new TextWordCounter();
    FileWordCounter obj2 = new FileWordCounter();
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you Want to count the number of words from a text or a file");
    System.out.println("Enter 1 for Counting the number of words from a text");
    System.out.println("Enter 2 for Counting the number of words from a file");
    choice = sc.nextInt();
    if(choice == 1)
    {
       obj1.TextWordCount(); 
    }
    else if(choice == 2)
    {
        obj2.FileWordCount();
    }
    else
    {
        System.out.println("invald input");
    }
 }
}