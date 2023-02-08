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
	EmployeeDaoImpl studentService;
	
	@GetMapping("/form")
	public String employeeData() {
		return "EmployeeData";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addStudent(@RequestParam("eid") int eid , @RequestParam("ename") String ename, @RequestParam("Salary") int salary, @RequestParam("did") int did) {
		studentService.addStudent(eid, ename, salary, did);
		return "success";
	}

}
