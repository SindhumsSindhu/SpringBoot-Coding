package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app1.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
