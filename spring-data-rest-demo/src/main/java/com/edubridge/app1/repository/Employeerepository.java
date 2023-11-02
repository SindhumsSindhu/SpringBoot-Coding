package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app1.nnt.Employee;

public interface Employeerepository extends JpaRepository<Employee, Long>{

}
