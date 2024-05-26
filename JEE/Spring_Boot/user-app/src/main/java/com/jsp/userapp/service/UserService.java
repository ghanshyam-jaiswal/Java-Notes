package com.jsp.userapp.service;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.userapp.entity.User;
import com.jsp.userapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
		
	}
	public User findById(int id) {

		Optional<User> op=userRepository.findById(id);
		if(op.isPresent()) {
			User user=op.get();
			return user;
		}
		else {
			throw new NullPointerException();
		}
		
	}

	
}
