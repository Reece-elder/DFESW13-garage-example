package com.qa.vehicles;

public class Car extends Vehicle {
	
	private boolean electric;
	private int doors;
	
	public Car(int numberWheels, String colour, boolean electric, int doors) {
		super(numberWheels, colour);
		this.electric = electric;
		this.doors = doors;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int fixVehicle() {
		int cost; // declaring my int
		
		if(electric == true) {
			cost = 800;
		} else {
			cost = 100;
		}
		return cost * doors + (10 * getNumberWheels());
	}
	
	
	
	

}
