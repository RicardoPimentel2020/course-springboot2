package com.alphasystemcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphasystemcourse.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
