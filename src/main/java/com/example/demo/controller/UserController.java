package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SaveUsers;
import com.example.demo.dto.UserResponse;
import com.example.demo.serviceLayer.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/saveUsers")
	public UserResponse saveUser(@RequestBody SaveUsers saveUsers)
	{
		UserResponse ur = new UserResponse();
		
		if(saveUsers != null) {
			userService.saveUsers(saveUsers);
			
			ur.setMessage("Data Saved Successfully...");
			ur.setStatus("Success");
			ur.setStatusCode("200");
		}
		else {
			ur.setMessage("Invalid Data Entered...");
			ur.setStatus("Failed");
			ur.setStatusCode("500");
			
		}
		
		return ur;
		
		
	}
	
	

	
	
	
	
	
}
