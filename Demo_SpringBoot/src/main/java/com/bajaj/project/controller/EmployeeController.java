package com.bajaj.project.controller;

import com.bajaj.project.service.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDaoImpl employeeDaoI;
	
	@GetMapping("/form-add")
	public String employeeData() {
		return "EmployeeData";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addEmployee(@RequestParam("eid") int eid , @RequestParam("ename") String ename, @RequestParam("Salary") int salary, @RequestParam("did") int did) {
		employeeDaoI.addEmployee(eid, ename, salary, did);
		return "success";
	}
	@GetMapping("/form-delete")
	public String employeeDelete(){return "EmployeeDelete";}

	@PostMapping("/delete")
	@ResponseBody
	public String deleteEmployee(@RequestParam("eid") int eid) {
		employeeDaoI.deleteEmployee(eid);
		return "success";
	}
}
