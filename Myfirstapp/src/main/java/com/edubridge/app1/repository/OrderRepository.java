package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app1.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

}
