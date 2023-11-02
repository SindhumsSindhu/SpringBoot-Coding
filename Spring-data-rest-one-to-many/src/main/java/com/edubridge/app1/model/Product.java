package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="product_details")

public class Product {
	@Id
	@GeneratedValue
	private long productid;
    private String productName;
    private String productDescription;
    private Double productPrice;
}
