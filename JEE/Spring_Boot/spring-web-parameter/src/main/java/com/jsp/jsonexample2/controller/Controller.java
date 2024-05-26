package com.jsp.jsonexample2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.jsonexample2.entity.Student;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Controller {

	// 1. json example
	
	@GetMapping("/save")
	public Student student(@RequestBody Student student) {
		System.out.println(student);
		return student;
		
	}
	
	// 2. spring web parameter
	
	@PostMapping("/home")
	public String m1(@RequestParam("id") int i,@RequestParam String name) {
		//req.getParameter("name");-> instead of using this we're using @RequestParam
		System.out.println(i+" "+name);
		return i+name;
		
	}
	
	@PostMapping("/home/{name}/{email}")
	public String m1(@PathVariable String name,@PathVariable("email") String mail) {
		//http://localhost:8080/home/shyam/shyam@gmail.com
		System.out.println(name+" "+mail);
		return name+" "+mail;
		
	}
	@PostMapping("/head")
	public String m2(@RequestHeader String name,@RequestHeader String email) {
		//http://localhost:8080/head -> by Headers section we have to give key and value.
		System.out.println(name+" "+email);
		return name+" "+email;
		
	}
	@GetMapping("/coo")
	public String m2(@Autowired HttpServletResponse response) {
		Cookie cookie=new Cookie("name", "java");
		Cookie cookie2=new Cookie("email", "java@gmail.com");
		response.addCookie(cookie);
		response.addCookie(cookie2);
				
		return "cookie";
		
	}
	@GetMapping("hel")
	public String m(@CookieValue String name) {
		System.out.println(name);
		return name;
	}
	
}
