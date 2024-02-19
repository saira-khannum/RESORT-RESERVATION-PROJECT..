package com.example.demo.services;

import com.example.demo.entities.Users;

public interface UsersService {

	public String  addUser(Users user);
	
	public boolean validateUser(String email,String passsword);
}
