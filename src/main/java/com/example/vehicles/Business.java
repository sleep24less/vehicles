package com.example.vehicles;

import java.util.Date;

public interface Business {

	public String sellCar();
	
	// STATIC METHOD
	static void buyCar(String carMake, Date carYear, int electricRange) {
		System.out.println("You sold an electric" + carYear + " " + carMake + " to a buyer");
	};
	
	// OVERLOADED STATIC METHOD
	static void buyCar(String carMake, Date carYear) {
		System.out.println("You sold an electric" + carYear + " " + carMake + " to a buyer");
	};
	
}
