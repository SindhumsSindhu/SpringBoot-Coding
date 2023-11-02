package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.entity.Product;
import com.edubridge.app1.repository.ProductRepository;

@Service

public class ProductService {
@Autowired

private ProductRepository productRepository;

public List<Product> getAllproducts() {
	return productRepository.findAll();
	
}
//to add
public Product addProduct(Product p) {
	return productRepository.save(p);
}
}
