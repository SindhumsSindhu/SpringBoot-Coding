package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.app1.entity.Employee;
@RepositoryRestResource(path = "Employee",collectionResourceRel = "employee")

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
