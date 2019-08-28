package com.tw.apistackbase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tw.apistackbase.Employee;
@Service
public class employeeService {
	
	public Employee addEmployee(Employee employee) {
		Employee employeeAdd = new Employee();
		employeeAdd.setId(employee.getId());
		employeeAdd.setGender(employee.getGender());
		employeeAdd.setName(employee.getName());
		employeeAdd.setAge(employee.getAge());
		
		return employeeAdd;
		
	}
	
	 public List<Employee> getEmployeeByName(String name){
		 List<Employee> employees = new ArrayList<Employee>();
		  List<Employee> employeesRtn = new ArrayList<Employee>();
		  Employee employee1 = new Employee();
		  employee1.setId(222);
		  employee1.setAge(20);
		  employee1.setGender("male");
		  employee1.setName("xiaoming");
		  
		  Employee employee2 = new Employee();
		  employee2.setId(2);
		  employee2.setAge(12);
		  employee2.setGender("male");
		  employee2.setName("xiaohu");
		  
		  Employee employee3 = new Employee();
		  employee3.setAge(18);
		  employee3.setGender("female");
		  employee3.setId(22);
		  employee3.setName("xiaoliu");

		  employees.add(employee1);
		  employees.add(employee2);
		  employees.add(employee3);
		  for (Employee employee : employees) {	  
		       if(employee.getName().contains(name)) {
		    	   employeesRtn.add(employee);
			}
		  }
		  return employeesRtn;
	 }
	 

}
