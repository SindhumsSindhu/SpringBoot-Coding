package com.edubridge.app1.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="product_category")

public class ProductCategory {
	@Id
	@GeneratedValue
	private Long categoryId;
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)

	@JoinColumn(name = "category_Id")
	
	private Set<Product> product= new HashSet<Product>();
}
