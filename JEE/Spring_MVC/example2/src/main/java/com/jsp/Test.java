package com.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("/second")
	public String m2() {
		return "home.jsp";
	}
}