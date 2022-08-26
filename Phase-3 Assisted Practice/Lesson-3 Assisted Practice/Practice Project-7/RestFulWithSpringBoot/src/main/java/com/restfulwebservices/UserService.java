package com.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//add method or CREATE RECORD
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return repo.save(u);
	}
	
	
	//List user Method
	
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	//get user by id
	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
	}

	//update user by id


	

}
