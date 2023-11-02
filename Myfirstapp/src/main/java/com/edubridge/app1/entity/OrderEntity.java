package com.edubridge.app1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
private int orderId;
	//@Column(nulltable = false)
private String orderStatus;


@OneToOne
@JoinColumn(name = "id")

public Product product;


public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}



public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public OrderEntity(int orderId, String orderStatus, Product product) {
	super();
	this.orderId = orderId;
	this.orderStatus = orderStatus;
	this.product = product;
}

public OrderEntity() {
	
}

@Override
public String toString() {
	return "OrderEntity [orderId=" + orderId + ", orderStatus=" + orderStatus + ", product=" + product + "]";
}






}