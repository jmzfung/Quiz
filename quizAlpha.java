import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public  class quizAlpha
{
  public static void main(String args[]) throws IOException 
  {
    try
    {
        Scanner src = null;
        FileReader fin = null;
        
        fin = new FileReader("H:\\Test.txt");
        src = new Scanner (System.in);
        src = new Scanner (fin);
        
        src.useDelimiter(", *");
        
        File newFile = new File ("H:\\", "MyTest.txt");
        FileWriter write = new FileWriter (newFile);
        
        ArrayList<String> toCopy = new ArrayList<String>();
        if (src.hasNext())
        {
            int count = 0;
            while(src.hasNextLine())
            {
                String line = src.nextLine();//Takes line from Test.txt
                toCopy.add(count, line);//places line in array
                
                System.out.println(line);
                write.write(line);//types line to CopyTest.txt
                if(src.hasNextLine())
                {
                    count++;
                }
            }
        }
        else
        {
        }
        
        fin.close();
    }
    catch (FileNotFoundException ex)
    {
        ex.printStackTrace();
        System.out.print("nummmm");
    }
    finally
    {

    }
  }
}