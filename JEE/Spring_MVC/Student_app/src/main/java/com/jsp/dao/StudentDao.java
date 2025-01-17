package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Student;

@Component
public class StudentDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public Student saveStudent(Student student) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}

	
//	public Student findStudent(String email,String password) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		et.begin();
//		Query query=em.createQuery("select s from Student s where s.email='email' and s.password='password'");
//		query.setParameter(1, email);
//		query.setParameter(2, password);
//		et.commit();
//		return null;
//	}
	
	public List<Student> findAllStudent() {

		return null;
	}
	
}
