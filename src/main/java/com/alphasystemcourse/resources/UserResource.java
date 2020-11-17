package com.alphasystemcourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alphasystemcourse.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Ricardo", "ricardo.com", "99988888", "1234567");
		
		return ResponseEntity.ok().body(u);
	}
	
}
