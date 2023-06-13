package com.example.vehicles;

import java.time.Year;

public class ElectricCar extends Car implements Movement, Business{
	
	public int electricRange;
	
	// CONSTRUCTOR
	public ElectricCar(String vehicleType, String carMake, Year carYear, int electricRange) {
		super(vehicleType, carMake, carYear);
		this.electricRange = electricRange;
	}
	
	// METHODS
	public void autoDrive() {
		System.out.println(this.carYear + " " + this.carMake + " automaticaly drives using AI");
	}
	
	// mandatory from movement interface 
	public String doDrive() {
		return this.carMake + " started driving";
	}
	
	// mandatory from movement interface
	public String doBrake() {
		return this.carMake + " started braking";
	}
	
	// mandatory from business interface
	public String sellCar() {
		return "You sold your electric " + this.carYear + " " + this.carMake;
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
