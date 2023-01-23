package PehlaPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundAndIOExceptionDemo {
    public static void main(String args[])
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/prathamgupta/IdeaProjects/Bajaj_Java_Training/src/PehlaPackage/file1.txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            String str = "AayushSaini";
            byte[] bytes;
            bytes = str.getBytes("UTF");
        }catch (FileNotFoundException e)
        {
            System.out.println("File Not Found Exception block Executed");
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("IOException Block executed");
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
