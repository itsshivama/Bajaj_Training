package tester;

import Demo_Spring_Bajaj.Address;
import Demo_Spring_Bajaj.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSecondAdr {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        Address ad = (Address) ac.getBean("empObj");
        Employee em = (Employee) ac.getBean("empObj1");
        System.out.println("Second obj call "+ad);
        System.out.println("Second obj call 2 "+em);
    }
}
