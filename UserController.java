package com.ibm.trainingmarch25.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/user")
	List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@PostMapping("/user")
	void addNewUser(@RequestBody User user)
	{
		service.addNewUser(user);
	}
}
