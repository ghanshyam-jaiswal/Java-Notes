package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.StudentDao;
import com.jsp.dao.SubjectDao;
import com.jsp.entity.Student;
import com.jsp.entity.Subject;

@Controller
public class StudentController {

	@Autowired
	 StudentDao dao;
	@Autowired
	 SubjectDao subjectDao;
	
	@RequestMapping("/signup")
	public ModelAndView signup(@Autowired Student student) {
		
		ModelAndView view=new ModelAndView("form.jsp");
		view.addObject("user",student);
		return view;
	}
	@RequestMapping("/savestudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		
		ModelAndView view=new ModelAndView("home.jsp");
		Student student2=dao.saveStudent(student);
		view.addObject("a",student2);
		return view;
	}
	
	@RequestMapping("/addsubject")
	public ModelAndView addSubject(@ModelAttribute Subject subject) {
		
		ModelAndView view=new ModelAndView("home.jsp");
		Subject subject2=subjectDao.saveSubject(subject);
		view.addObject("a",subject2);
		return view;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("email") String email,@RequestParam("password") String password ) {
		
		ModelAndView view=new ModelAndView("home.jsp");
		view.addObject("email",email);
		view.addObject("password",password);
		return view;
		
	}
	@RequestMapping("/findAll")
	public ModelAndView findAll() {
		
		ModelAndView view=new ModelAndView("home.jsp");
		List<Student> list=dao.findAllStudent();
		view.addObject("email",email);
		view.addObject("students",list);
		return view;
		
	}
	
}

