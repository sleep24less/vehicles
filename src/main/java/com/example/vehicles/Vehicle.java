package com.example.vehicles;

public abstract class Vehicle {
	
	public String vehicleType;
	
	// CONSTRUCTOR
	public Vehicle(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	// GETTERS and SETTERS
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
	// METHODS
	public void getVehiclePrice(String vehicleType) {
			if (vehicleType == "Truck") {
				System.out.println("Price of " + this.vehicleType + " is more than 80k");
			} else if (vehicleType == "Car") {
				System.out.println("Price of " + this.vehicleType + " is around 40k");
			} else if (vehicleType == "Bike") {
				System.out.println("You are broke, but atleast you're helping the climate!");
			}
	}
	

	
	// ABSTRACT methods
	public abstract void showType();
	
}
