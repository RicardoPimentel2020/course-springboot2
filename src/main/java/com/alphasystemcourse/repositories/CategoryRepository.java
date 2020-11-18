package com.alphasystemcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphasystemcourse.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
