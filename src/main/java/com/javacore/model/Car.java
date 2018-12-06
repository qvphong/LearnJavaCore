package com.javacore.model;

import com.javacore.service.CarService;

public class Car {
	private CarService carService;
	
	public void run() {
		carService.run();
	}
}
