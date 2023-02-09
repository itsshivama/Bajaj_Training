package com.bajaj.controller;

import com.bajaj.service.EmployeeDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	final EmployeeDaoImpl employeeDaoI;

	public EmployeeController(EmployeeDaoImpl employeeDaoI) {
		this.employeeDaoI = employeeDaoI;
	}

	@GetMapping("/form-add")
	public String employeeData() {
		return "EmployeeData";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addEmployee(@RequestParam("Salary") int salary, @RequestParam("did") int did, @RequestParam("eid") int eid , @RequestParam("ename") String ename) {
		employeeDaoI.addEmployee(eid, ename, salary, did);
		return "success.html";
	}
	@GetMapping("/delete-employee")
	public String employeeDelete(){return "EmployeeDelete";}

	@PostMapping("/delete")
	@ResponseBody
	public String deleteEmployee(@RequestParam("eid") int eid) {
		employeeDaoI.deleteEmployee(eid);
		return "success.html";
	}

	@GetMapping("/update-employee")
	public String employeeUpdate(){return "UpdateEmployee";}

	@PostMapping("/form-update")
	@ResponseBody
	public String updateEmployee(@RequestParam("Salary") int salary, @RequestParam("did") int did, @RequestParam("eid") int eid , @RequestParam("ename") String ename){
		employeeDaoI.updateEmployee(eid, ename, salary, did);
		return "success.html";
	}
}