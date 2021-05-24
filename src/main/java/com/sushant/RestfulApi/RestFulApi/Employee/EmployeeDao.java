package com.sushant.RestfulApi.RestFulApi.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	/* @Query("SELECT * FROM employee WHERE firstname = ?1")
	Employee findByName(String name);
/*/
}
