package com.sushant.RestfulApi.RestFulApi.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	@Autowired
	EmployeeDao dao;

	public Employee saveEmployee(Employee employee) {
		return dao.save(employee);
	}

	public List<Employee> saveEmployees(List<Employee> employees) {
		return dao.saveAll(employees);
	}

	public Employee viewEmployeebyID(Integer id) {
		return dao.findById(id).orElse(null);
	}

	public List<Employee> viewAllEmploye() {
		return dao.findAll();
	}

	/*public Employee viewEmployeebyName(String name) {
		return dao.findByName(name);
	}
*/
	public String DeleteByID(Integer id) {
		dao.deleteById(id);
		return ("deltete id=" + (id));
	}

	public Employee UpdateEmployee(Employee employee) {
		Employee employeeupdate = dao.findById(employee.getId()).orElse(null);
		employeeupdate.setFirstname(employee.getFirstname());
		employeeupdate.setLastname(employee.getLastname());
		return employeeupdate;
	}
}
