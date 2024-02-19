package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Users {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
String username;
String email;
String password;
String mobile;
String address;
String arraivingdate;
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public Users(int id, String username, String email, String password, String mobile, String address,
		String arraivingdate) {
	super();
	this.id = id;
	this.username = username;
	this.email = email;
	this.password = password;
	this.mobile = mobile;
	this.address = address;
	this.arraivingdate = arraivingdate;
}
@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", mobile="
			+ mobile + ", address=" + address + ", arraivingdate=" + arraivingdate + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getArraivingdate() {
	return arraivingdate;
}
public void setArraivingdate(String arraivingdate) {
	this.arraivingdate = arraivingdate;
}



}
