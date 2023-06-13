package com.example.vehicles;

import java.util.Date;

public interface Movement {
	
	public String doDrive();
	
	public String doBrake();
	
	public default void doCrash(String carMake, Date carYear) {
		System.out.println(carYear + " " + carMake + " crashed!");
	};
	
}
