package tester;

import Demo_Spring_Bajaj.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBeanFactory {
    public static void main(String args[]){
        BeanFactory bf = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        Employee emp1 = (Employee)bf.getBean("employee1");

        System.out.println("Bean Factory Output is = "+emp1);
    }
}
