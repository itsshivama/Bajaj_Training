package Demo_Spring_Bajaj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Demo_Spring_Bajaj")
public class Spring_Configuration {
    @Bean
    public Employee createEmployee(){
        Employee employee = new Employee();
        employee.setEid(101);
        employee.setName("Mohan");
        employee.setSal(50000);
        Address address = createAddress();
        employee.setAddress(address);
        return employee;
    }

    @Bean(name = "address")
    public Address createAddress() {
        Address address = new Address();
        address.setAddressLine1("Qora");
        address.setAddressLine2(" Bar & Club");
        return address;
    }
}