package tester;

import Demo_Spring_Bajaj.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        Employee emp3 = (Employee)ac.getBean("employee3");
        System.out.println("Constructor Setter Injection = "+emp3);
    }
}
