import java.util.ArrayList;
import java.util.List;
public class Employee
{
    int eid;
    String name, company;
    double salary;
    static List<Employee> l = new ArrayList<>();

    Employee(int eid, String name, String company, double salary)
    {
    this.eid = eid;
    this.name = name;
    this.company = company;
    this.salary = salary;
    }

    static void salaryGreaterThan50()
    {
        for(int i=0;i<l.size(); i++)
        {
            if(l.get(i).salary>50000)
            {
            System.out.println(l.get(i).name);
            }
        }
    }
    static void printCount()
    {
        System.out.println(l.size());
    }

}