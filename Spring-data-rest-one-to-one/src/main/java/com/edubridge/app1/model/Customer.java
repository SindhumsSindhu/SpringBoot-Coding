package com.edubridge.app1.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Customer {

	

	@Id

	@GeneratedValue

   private Long customerId;

   private String customerName;

   private String customerEmail;

   private Long customerMobile;

   

   @OneToOne(cascade = CascadeType.ALL)

   @JoinColumn(name = "address_id",referencedColumnName = "id")

   private Address customerAddress;

}


