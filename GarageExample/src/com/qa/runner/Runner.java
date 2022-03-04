package com.qa.runner;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage newGarage = new Garage();
		
		Vehicle car1 = new Car(4, "purple", true, 3);
		
		System.out.println(newGarage.addToGarage(car1));
		newGarage.addToGarage(car1);
		newGarage.fixVehicle(new Car(4, "purple", true, 3));
		newGarage.printGarage();
		
	}

}
