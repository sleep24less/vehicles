package com.example.vehicles;

import java.util.Date;

public class Car extends Vehicle {
	
	public String carMake;
	public Date carYear;
	
	// CONSTRUCTOR
	public Car(String vehicleType, String carMake, Date carYear) {
		super(vehicleType); 
		this.carMake = carMake;
		this.carYear = carYear;
	}
	
	// METHODS
	
	public void doDrive() {
		System.out.println(this.carMake + " started driving");
	}
	
	public void doBrake() {
		System.out.println(this.carMake + " started braking");
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
