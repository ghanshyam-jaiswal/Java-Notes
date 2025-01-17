package com.jsp.springbootdatajpa.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.jsp.springbootdatajpa.entity.Car;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;
	
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}

	public List<Car> findByBrand(String brand) {
		return carRepository.findByBrand(brand) ;
	}

	
}
