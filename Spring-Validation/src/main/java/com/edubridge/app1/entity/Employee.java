package com.edubridge.app1.entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


public class Employee {
	
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="emp_id")

	private Integer empId;

	@Column(name="emp_name")

	@NotEmpty

	@Size(min=2,message = "name must be 2 char")

	private String empName;

	@NotEmpty

	@Size(min=5,max=5,message="Salary must contain 5 digits")

	private String empSalary;

	@Column(name="empMobile")

	@NotEmpty

	@Size(min=10,max=10,message="phone no must contain 10 digits")

	private String empMobile;

	@Column(name="empEmail")

	@NotEmpty

	

	private String empEmail;

	}


