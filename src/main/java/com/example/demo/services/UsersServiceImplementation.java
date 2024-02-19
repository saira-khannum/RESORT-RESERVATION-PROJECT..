package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repositories.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {

	private static final Object password = null;
	@Autowired
	UsersRepository repo;
	
	@Override
	public String addUser(Users user)
	{
		repo.save(user);
		
		return"welcome";
	}

	@Override
	public boolean validateUser(String email, String passsword) {
		// TODO Auto-generated method stub
		Users user=repo.findByEmail(email);
		String db_password=user.getPassword();
		if(db_password.equals(password))
		{
			return true;
		}
		else
		{
		return false;
	}

	}
	}

