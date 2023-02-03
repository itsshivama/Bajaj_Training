package tester;


import Demo_Spring_Bajaj.Employee;
import Demo_Spring_Bajaj.Spring_Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
    public static void main(String[] args){
        ConfigurableApplicationContext ca = new AnnotationConfigApplicationContext(Spring_Configuration.class);
        Employee emp = (Employee)ca.getBean("createEmployee");
        System.out.println(emp);
    }
}
