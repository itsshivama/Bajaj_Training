package PehlaPackage;

public class ExceptionAssignment {
    public static void main(String args[])
    {
        int a = 5, b=0;
        try {
            System.out.println("Division: " + a / b);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside Finally Block");
        }
    }
}
