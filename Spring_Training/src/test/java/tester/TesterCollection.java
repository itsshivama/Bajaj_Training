package tester;

import Demo_Spring_Bajaj.EmployeeCollection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterCollection {
    public static void main(String[] args){
        ConfigurableApplicationContext ca = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        EmployeeCollection ec = (EmployeeCollection) ca.getBean("employee4");
        System.out.println(ec);
    }
}A