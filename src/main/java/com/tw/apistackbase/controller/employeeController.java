package com.tw.apistackbase.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.Employee;
import com.tw.apistackbase.service.employeeService;

@RestController
@RequestMapping
public class employeeController {
	@Autowired
	private employeeService service;
	
//	 private static List<Employee> employees =
//			 new ArrayList<Employee>() {
//		 {
//			 add(new Employee(1,"xiaoming",21,"male"));
//			 add(new Employee(2,"xiaohong",22,"female"));
//			 add(new Employee(3,"xiaopeng",23,"male"));
//			 add(new Employee(4,"xiaogang",24,"male"));
//			 add(new Employee(5,"xiaoli",25,"female"));
//		 }
//		
//	};
	
	 @GetMapping
	 public ResponseEntity<List<Employee>> getEmployees(){
	  List<Employee> employees = new ArrayList<Employee>();
	  Employee employee1 = new Employee();
	  employee1.setId(222);
	  employee1.setAge(20);
	  employee1.setGender("male");
	  employee1.setName("xiaoming");
	  employees.add(employee1);
	  return ResponseEntity.ok(employees);
	 } 
	 
	 @GetMapping 
	 public ResponseEntity<List<Employee>> getEmployeeByName(@RequestParam("name") String nameLike){
	 List<Employee> employeesRtn = service.getEmployeeByName(nameLike);
	  return ResponseEntity.ok(employeesRtn);     

	 }
	 
	 @PostMapping(consumes = "application/json")
	 public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee){
		 service.addEmployee(employee);
		 return ResponseEntity.status(HttpStatus.CREATED).build();
	 }
	 
	 
}
