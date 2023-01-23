package PehlaPackage;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;
        a = sc.nextInt();
        b = sc.nextInt();

        int arr[] = new int[3];
        try{
            System.out.println("Division: "+ a/b);
            arr[3]=0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
