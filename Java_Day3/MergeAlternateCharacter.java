package PehlaPackage;

import java.io.*;

public class MergeAlternateCharacter {
    public static void main(String args[])
    {
        try {
            BufferedReader f1 = new BufferedReader(new FileReader("/Users/prathamgupta/IdeaProjects/Bajaj_Java_Training/src/PehlaPackage/file1.txt"));
            BufferedReader f2 = new BufferedReader(new FileReader("/Users/prathamgupta/IdeaProjects/Bajaj_Java_Training/src/PehlaPackage/file2.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("/Users/prathamgupta/IdeaProjects/Bajaj_Java_Training/src/PehlaPackage/outputFile.txt"));
            boolean mode = false;

            while(f1.ready() && f2.ready())
            {
                if(mode)
                {
                    output.write((char)f1.read());
                }
                else
                {
                    output.write((char)f2.read());
                }
                mode =!mode;
            }
            output.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found Exception block executed");
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("General Exception Block");
            System.out.println(e.getMessage());
        }
    }
}
