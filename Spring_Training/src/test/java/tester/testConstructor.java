package tester;

import Demo_Spring_Bajaj.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testConstructor {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        Employee emp3 = (Employee)ac.getBean("employee2");
        System.out.println("Constructor Setter Injection = "+emp3);
    }
}
