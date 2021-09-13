package com.saraya.services;

import org.springframework.stereotype.Service;

@Service
public class UserValidation {
	
	public boolean isValid(String username, String password) {
		if(username.equalsIgnoreCase("bamba") && password.equalsIgnoreCase("salut147")) {
			return true;
		}else {
			return false;
		}
	}


}
