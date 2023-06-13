package com.example.vehicles;

import java.time.Year;

public interface Movement {
	
	public String doDrive();
	
	public String doBrake();
	
	public default void doCrash(String carMake, Year carYear) {
		System.out.println(carYear + " " + carMake + " crashed!");
	};
	
}
