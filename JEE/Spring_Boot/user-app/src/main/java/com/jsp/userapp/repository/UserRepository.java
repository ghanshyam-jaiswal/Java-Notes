package com.jsp.userapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.userapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
