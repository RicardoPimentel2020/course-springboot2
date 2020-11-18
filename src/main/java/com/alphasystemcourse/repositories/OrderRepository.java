package com.alphasystemcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphasystemcourse.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
