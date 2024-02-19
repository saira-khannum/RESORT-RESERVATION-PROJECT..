package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Users;
import com.example.demo.services.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	UsersService userv;
	
@PostMapping("/map-register")
	public String addUser(
			@ModelAttribute Users user)
	{
	userv.addUser(user);
	
	
	return "Home";
	}
@PostMapping("/login")
public String validateUser(@RequestParam String email,@RequestParam String password)
{
	boolean loginstatus=userv.validateUser(email,password);
	if(loginstatus==true)
	{
		return "home";
	}
	else {
		return "login";
	}
}
}
