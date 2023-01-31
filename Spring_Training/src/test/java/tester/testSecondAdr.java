package tester;

import Demo_Spring_Bajaj.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSecondAdr {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("my_beans_configuration.xml");
        Address ad = (Address) ac.getBean("empObj");
        System.out.println("Second obj call "+ad);
    }
}
