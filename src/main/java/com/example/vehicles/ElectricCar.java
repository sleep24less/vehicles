package com.example.vehicles;

import java.util.Date;

public class ElectricCar extends Car {
	
	public String electricRange;
	
	// CONSTRUCTOR
	public ElectricCar(String vehicleType, String carMake, Date carYear, String electricRange) {
		super(vehicleType, carMake, carYear);
		this.electricRange = electricRange;
	}
	
	// METHODS
	public void autoDrive() {
		System.out.println(this.carYear + " " + this.carMake + " automaticaly drives using AI");
	}
	
	// OVERRIDEN METHODS FROM FATHER CLASSES
	public void doRefill() {
		System.out.println(this.carYear + " " + this.carMake + " started recharging to max " + this.electricRange + "km range");
	}
	
	public void getVehiclePrice() {
		if (this.carMake == "MERCEDES") {
			System.out.println("Price of electric" + this.carYear + " " + this.carMake + " is around 80k");
		} else if (this.carMake == "TOYOTA") {
			System.out.println("Price of electric" + this.carYear + " " + this.carMake + " is around 40k");
		} else if (this.carMake == "VOLKSWAGEN") {
			System.out.println("Price of electric" + this.carYear + " " + this.carMake + " is around 20k");
		}
	}
	
}
