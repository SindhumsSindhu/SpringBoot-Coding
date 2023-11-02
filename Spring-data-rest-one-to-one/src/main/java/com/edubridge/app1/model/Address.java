package com.edubridge.app1.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data

@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@Entity

@Table(name="address")

public class Address {

	@Id

	@GeneratedValue

	private Long id;

	private String city;

	private String state;

	private String country;

}


