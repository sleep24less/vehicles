package com.example.vehicles;

import java.time.Year;

public interface Business {

	public String sellCar();
	
	// STATIC METHOD
	static void buyCar(String carMake, Year carYear, int electricRange) {
		System.out.println("You sold an electric" + carYear + " " + carMake + " to a buyer");
	};
	
	// OVERLOADED STATIC METHOD
	static void buyCar(String carMake, Year carYear) {
		System.out.println("You sold an electric" + carYear + " " + carMake + " to a buyer");
	};
	
}
