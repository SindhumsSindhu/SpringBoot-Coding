package com.edubridge.app1.service;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.entity.OrderEntity;
import com.edubridge.app1.repository.OrderRepository;

@Service

public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<OrderEntity> getAllorders() {
		return orderRepository.findAll();
	}
	public OrderEntity saveOrder(OrderEntity o) {
		return orderRepository.save(o);
		
	}

}
