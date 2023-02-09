package com.bajaj.project.service;

import com.bajaj.project.dao.EmployeeDao;
import com.bajaj.project.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoImpl {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void addEmployee(int id, String ename, int salary, int did) {
		EmployeeEntity employeeEntity = new EmployeeEntity(id,ename,salary,did);
		employeeDao.save(employeeEntity);
	}
	public void deleteEmployee(int eid) {
		EmployeeEntity employeeEntity = new EmployeeEntity(eid);
		employeeDao.delete(employeeEntity);
	}

	public void updateEmployee(int id, String ename, int salary, int did) {
		EmployeeEntity employeeEntity = new EmployeeEntity(id,ename,salary,did);
		employeeDao.save(employeeEntity);
	}
}
