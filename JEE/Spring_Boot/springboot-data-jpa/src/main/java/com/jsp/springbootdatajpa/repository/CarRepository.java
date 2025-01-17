package com.jsp.springbootdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsp.springbootdatajpa.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	@Query("select c from Car where brand=?1")
	List<Car> findByBrand(String name);
}
