package tester;

import Demo_Spring_Bajaj.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        Employee emp1 = (Employee)ac.getBean("employee1");
        System.out.println("ApplicationContext OutPut is = "+emp1);
    }
}