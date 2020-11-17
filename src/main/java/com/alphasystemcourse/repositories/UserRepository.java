package com.alphasystemcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alphasystemcourse.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
