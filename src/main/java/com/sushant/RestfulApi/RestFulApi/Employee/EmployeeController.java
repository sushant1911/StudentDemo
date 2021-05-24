package com.sushant.RestfulApi.RestFulApi.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServices employeeServices;

	@PostMapping("/addemployee")
	public Employee AddProduct(@RequestBody Employee employee) {
		return employeeServices.saveEmployee(employee);
	}

	@PostMapping("/adddemployees")
	public List<Employee> AddProduct(@RequestBody List<Employee> employee) {
		return employeeServices.saveEmployees(employee);
	}

	@GetMapping("/viewproduct/{id}")
	public Employee viewEmployee(@PathVariable Integer id) {
		return employeeServices.viewEmployeebyID(id);
	}

	@GetMapping("/viewAllEmployee")
	public List<Employee> viewAllEmployee() {
		return employeeServices.viewAllEmploye();
	}

	/*
	 * @GetMapping("/viewEmployeebyname/{name}") public Employee
	 * viewEmployee(@PathVariable String name) { return
	 * employeeServices.viewEmployeebyName(name); }
	 */
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return employeeServices.DeleteByID(id);
	}

	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable Integer id) {
		return employeeServices.UpdateEmployee(emp,id);
	}

}
