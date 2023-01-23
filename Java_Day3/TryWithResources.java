package PehlaPackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources {
    public static void main(String args[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("/Users/prathamgupta/IdeaProjects/Bajaj_Java_Training/src/PehlaPackage/file1.txt"));

            while(br.ready())
            {
                System.out.println((char)br.read());
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
