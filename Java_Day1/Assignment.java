

public class Assignment {
    void Maximum(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else {
            if(b>c)
            {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }

    void Swap(int a, int b)
    {
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b: "+b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }

    void SwapWithoutThird(int a, int b)
    {
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b:"+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }

    void NumberSign(int a)
    {
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }

    void checkPrime(int a)
    {
        for(int i=2; i<a/2; a++)
        {
            if(a%i==0)
            {
                System.out.println("Not Prime");
                break;
            }
        }
        System.out.println("Prime");
    }

    void checkPalindrome(String a) {
        int i = 0, j = a.length() - 1;
        while (i < j) {
            if (a.charAt(j) != a.charAt(i)) {
                System.out.println("Not Palindrome");
                break;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
    static void cube(int a)
    {
        System.out.println(a*a*a);
    }


    public static void main(String args[])
    {
        Assignment obj = new Assignment();

        obj.Maximum(1,2,3);
        obj.Swap(4,5);
        obj.SwapWithoutThird(4,5);
        obj.NumberSign(-5);
        obj.checkPrime(9);
        obj.checkPalindrome("101");

        Employee.l.add(new Employee(1,"A", "Bajaj Markets", 51000));
        Employee.l.add(new Employee(1,"B", "Bajaj Health", 41000));
        Employee.l.add(new Employee(1,"C", "Bajaj Finance", 39000));
        Employee.l.add(new Employee(1,"D", "Bajaj Markets", 35000));
        Employee.l.add(new Employee(1,"E", "Bajaj Securities", 60000));
        Employee.salaryGreaterThan50();
        Employee.printCount();

        cube(3);
    }
}
