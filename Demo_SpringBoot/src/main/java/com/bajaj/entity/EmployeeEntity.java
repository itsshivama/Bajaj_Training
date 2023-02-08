package com.bajaj.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    private EmployeeDao employeeDao;

    @Id
    private int eid;
    private String name;
    private int salary;

    public EmployeeEntity(){}

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeEntity(int eid, String name, int salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public void add(){
        EmployeeEntity employeeEntity = new EmployeeEntity(2222, "Dhoni", 90);
        employeeDao.save(employeeEntity);
    }
}
