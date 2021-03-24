package com.ASOS.Training.CrudRestAPIh2.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ASOS.Training.CrudRestAPIh2.model.Employee;

@Repository

public interface EmployeeRepository extends  JpaRepository<Employee, Integer>{

//	List<Employee> findAll();

}
