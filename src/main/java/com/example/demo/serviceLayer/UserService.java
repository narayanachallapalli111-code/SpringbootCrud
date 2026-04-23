package com.example.demo.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.SaveUsers;
import com.example.demo.dto.UserResponse;
import com.example.demo.models.Users;
import com.example.demo.repositoryLayer.UsersRepo;

@Service
public class UserService {
	@Autowired
	private UsersRepo userRepo;
	
	public void saveUsers(SaveUsers userDetails) {
		
		try {
			
		
		Users u= new Users();
		u.setEmail(userDetails.getEmail());
		u.setPassword(userDetails.getPassword());
		u.setUserName(userDetails.getUserName());
		u.setPhoneNo(userDetails.getPhoneNo());
		userRepo.save(u);
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	
		
		
	}

}
