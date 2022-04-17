package com.ibm.trainingmarch25.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	List<User> getAllUsers()
	{
		return (List<User>) repo.findAll();
	}

	public void addNewUser(User user) {
		repo.save(user);
		
	}
}
