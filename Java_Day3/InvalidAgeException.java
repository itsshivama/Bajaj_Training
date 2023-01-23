package PehlaPackage;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        try{
            int age = sc.nextInt();

            if(age<19)
                throw new InvalidAgeException("Invalid Age");

            System.out.println("Age: "+age);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
