package com.qa.garage;

public class Truck extends Vehicle {
	
	private String engineType;
	private boolean fourWheelDrive;
	
	public Truck() {
		super();
		this.engineType = "???";
		this.fourWheelDrive = false;
		
	}
	public Truck(String make, String model, double price, String engineType, boolean fourWheelDrive) {
		super(make, model, price);
		this.engineType = engineType;
		this.fourWheelDrive = fourWheelDrive;
	}
	
	
	
	

}
