package com.edubridge.app1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.entity.OrderEntity;
import com.edubridge.app1.entity.Product;
import com.edubridge.app1.service.OrderService;
import com.edubridge.app1.service.ProductService;

@RestController
@RequestMapping("/order")


public class OrderController {
	
	@Autowired

	private OrderService orderService;
	//get all products
	@GetMapping("/all")
	public List<OrderEntity> getAllOrders(){
		return this.orderService.getAllorders();
		
	}
	@PostMapping("/add")
	public OrderEntity addorderEntity(@RequestBody OrderEntity o) {
		return orderService.saveOrder(o);
		
	}

	}


