package com.irmaktekin.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LoginController {
	
	
	private AuthenticationService authenticationService;
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService=authenticationService;
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	
	public String redirectToLogin() {
		return "login";
		
	}
@RequestMapping(value="login", method=RequestMethod.POST)
	
	public String goToWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
	if(authenticationService.authenticate(name, password)) {
		model.put("name", name);	
		
		//Authentication
		//name-irmaktekin
		//password-dummy
		return "welcome";
		
	}
	else {
		model.put("errorMessage","Invalid Credentials! Please try again");
		
		return "login";
	}
	
	
		
	}

}
