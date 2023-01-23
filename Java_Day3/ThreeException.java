package PehlaPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThreeException {
    public static void main(String args[])
    {
        try
        {
            String str = null;
            System.out.println(str.charAt(0));
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        try {

            System.out.println(9 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
