package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicles.Vehicle;

public class Garage {
	
	public ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	public String addToGarage(Vehicle vehicle) {
		vehicleList.add(vehicle);
		return vehicle.getClass().getSimpleName() + " added to list"; 
	}
	
	public ArrayList<Vehicle> printGarage() {
		return vehicleList;
	}
	
	public int fixVehicle(Vehicle vehicle) {
		return vehicle.fixVehicle();
	}
	
	public String removeVehicle(int index) {
		vehicleList.remove(index);
		return "vehicle of index: " + index + " removed from list";
	}
	
	public String updateVehicle(int index, Vehicle vehicle) {
		vehicleList.set(index, vehicle);
		return "updated vehicle of index: " + index;
	}
	
	public String removeAll() {
		vehicleList.clear();
		return "All vehicles removed :)";
	}

}
