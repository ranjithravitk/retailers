package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.modal.Login;
import com.cts.service.LoginRepositary;
import com.cts.service.Loginservice;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private Loginservice service;
	
	 @GetMapping("/login")
	    public boolean userPresent(@RequestBody Login user) {
	        boolean temp=service.UserExist(user);
	        return temp;
	    }


	
}
