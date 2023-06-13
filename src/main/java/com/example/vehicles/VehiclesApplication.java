package com.example.vehicles;

import java.time.Year;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehiclesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(VehiclesApplication.class, args);
		
		// Create an array of Vehicle objects
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		// Add NEW vehicle objects to the array
		vehicles.add(new Car("CAR", "MERCEDES", Year.of(2021)));
        vehicles.add(new Car("TRUCK", "TOYOTA", Year.of(2012)));
        vehicles.add(new ElectricCar("CAR", "VOLKSWAGEN", Year.of(2023), 320));
		
        // Loop through the array and perform the checkType static method
        for(int i = 0; i < vehicles.size(); i++) {
        	System.out.println(checkType(vehicles.get(i)));
        }
		
	}
	
	// METHOD that takes in SUPERCLASS as a parameter
	public static String checkType(Vehicle obj) {
		if (obj instanceof Vehicle) {
			return obj.getVehicleType();
		} else {
			return "Object is not instance of Vehicle";
		}
	}

}
