package com.example.vehicles;

import java.time.Year;

public class Car extends Vehicle implements Movement, Business {
	
	public String carMake;
	public Year carYear;
	
	// CONSTRUCTOR
	public Car(String vehicleType, String carMake, Year carYear) {
		super(vehicleType); 
		this.carMake = carMake;
		this.carYear = carYear;
	}
	
	// METHODS
	
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
		return "You sold your " + this.carYear + " " + this.carMake;
	}
	
	public void doRefill() {
		System.out.println(this.carMake + " started refilling with petrol");
	}
	
	// OVERRIDEN METHOD FROM VEHICLE CLASS
	public void getVehiclePrice() {
			if (this.carMake == "MERCEDES") {
				System.out.println("Price of " + this.carYear + " " + this.carMake + " is around 80k");
			} else if (this.carMake == "TOYOTA") {
				System.out.println("Price of " + this.carYear + " " + this.carMake + " is around 40k");
			} else if (this.carMake == "VOLKSWAGEN") {
				System.out.println("Price of " + this.carYear + " " + this.carMake + " is around 20k");
			}
	}
	
	// MANDATORY METHOD FROM ABSTRACT CLASS VEHICLE
	public void showType() {
		System.out.println("Car Type: " + vehicleType + " Make: " + carMake + " Year: " + carYear);
	}
	
	
	
}
