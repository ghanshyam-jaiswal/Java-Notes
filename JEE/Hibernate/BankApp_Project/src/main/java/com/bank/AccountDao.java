package com.bank;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AccountDao {
	
EntityManagerFactory entityManagerFactory=DatabaseConfig.getEntityManagerFactory();
	
	public Account saveAccount(Account account) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.persist(account);
		eTransaction.commit();
		return account;
	}
	public Account updateAccount(Account account) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.merge(account);
		eTransaction.commit();
		return account;
	}
	public Account findAccountById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		return entityManager.find(Account.class,id);
	}
	public List<Account> findAllAccount() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		return entityManager.createQuery("select u from User u").getResultList();
	}
	public Account deleteAccount(Account account) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.remove(account);
		eTransaction.commit();
		return account;
	}
//	updateUser
//	deleteUser
//	findUserById
//	findAllUser
	
	
}
