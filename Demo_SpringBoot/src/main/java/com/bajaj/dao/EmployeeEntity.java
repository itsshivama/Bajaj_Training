package com.bajaj.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeEntity {
    @Autowired
    private EmployeeDao employeeDao;
    public void add(){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeDao.save(employeeEntity);
    }
}
