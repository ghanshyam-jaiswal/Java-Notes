package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Student;
import com.jsp.entity.Subject;

@Component
public class SubjectDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public Subject saveSubject(Subject subject) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(subject);
		et.commit();
		
		return subject;
	}
	
}
