package com.jsp.springbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootdatajpa.entity.Car;
import com.jsp.springbootdatajpa.repository.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;
	
	@PostMapping("/save")
	private Car saveCar(@RequestBody Car car) {
	 return carService.saveCar(car);
	}
	
	@GetMapping("/find/{brand}")
	public List<Car> findByBrand(@PathVariable String brand) {
		return carService.findByBrand(brand);
	}
	

}
