package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.entity.Product;
import com.edubridge.app1.service.ProductService;

@RestController
@RequestMapping("/product")

public class ProductController {
@Autowired

private ProductService productService;
//get all products
@GetMapping("/all")
public List<Product> getAllProducts(){
	return this.productService.getAllproducts();
	
}
//adding 
	@PostMapping("/add") //http://localhost:8080/product/add
	public Product productAdd(@RequestBody Product p) {
		return this.productService.addProduct(p);
	}

}
