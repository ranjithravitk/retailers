package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.modal.Login;

@Service
public class Loginservice {

	@Autowired
	private LoginRepositary repo;
	

	public boolean UserExist(Login user) {
		// TODO Auto-generated method stub
		List<Login> temp=repo.findAll();
		for(Login i:temp) {
	    	if(i.getUsername()==user.getUsername()) {
	    		return true;
	    	}
	    }
	  
		return false;
	}
	
	
	
}
