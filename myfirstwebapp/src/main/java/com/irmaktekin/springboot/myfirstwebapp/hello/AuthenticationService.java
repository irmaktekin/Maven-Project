package com.irmaktekin.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName =username.equalsIgnoreCase("irmaktekin");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		
		return isValidUserName && isValidPassword;
		
	}

}
