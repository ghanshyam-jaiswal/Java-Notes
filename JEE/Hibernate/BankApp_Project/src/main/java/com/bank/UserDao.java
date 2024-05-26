package com.bank;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class UserDao {
	
	EntityManagerFactory entityManagerFactory=DatabaseConfig.getEntityManagerFactory();
	
	public User saveUser(User user) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.persist(user);
		eTransaction.commit();
		return user;
	}
	public User updateUser(User user) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.merge(user);
		eTransaction.commit();
		return user;
	}
	public User findUserById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		return entityManager.find(User.class,id);
	}
	public List<User> findAllUser() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		return entityManager.createQuery("select u from User u").getResultList();
	}
	public User deleteUser(User user) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.remove(user);
		eTransaction.commit();
		return user;
	}
//	updateUser
//	deleteUser
//	findUserById
//	findAllUser
	
	
	
	
	
	
	
	
	
	
	
}
