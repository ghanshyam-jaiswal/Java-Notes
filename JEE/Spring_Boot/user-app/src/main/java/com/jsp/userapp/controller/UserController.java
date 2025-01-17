package com.jsp.userapp.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.userapp.entity.User;
import com.jsp.userapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/save")
	@CrossOrigin // it allows multiple server to work together because in java we have tomcat server if we use react then it use different server so to deal with multiple server we use it.
	private User saveUser(@RequestBody User user) {

		return userService.saveUser(user);
	}
	
	@GetMapping("/find")
	private User findById(@RequestParam int id ) {
		
		return userService.findById(id);
	}
	
}
