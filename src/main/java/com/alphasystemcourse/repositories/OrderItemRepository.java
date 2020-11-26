package com.alphasystemcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphasystemcourse.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
