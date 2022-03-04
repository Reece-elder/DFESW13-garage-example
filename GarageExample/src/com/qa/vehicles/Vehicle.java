package com.qa.vehicles;

public abstract class Vehicle {
	
	private int numberWheels;
	private String colour;
	
	public Vehicle(int numberWheels, String colour) {
		super();
		this.numberWheels = numberWheels;
		this.colour = colour;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	// Abstract fixVehicle method
	// forward declaration, ensuring all classes have a method called fixVehicle()
	public abstract int fixVehicle();

	
	@Override
	public String toString() {
		return "Vehicle [numberWheels=" + numberWheels + ", colour=" + colour + "]";
	}
	
	
	
	

}
