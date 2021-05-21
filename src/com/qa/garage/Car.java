package com.qa.garage;

public class Car extends Vehicle {
	
	private String engineType;
	private int numberOfDoors;
	
	public Car() {
		super();
		this.engineType = "???";
		this.numberOfDoors = 0;
	}
	
	public Car(String make, String model, double price, String engineType, int numberOfDoors) {
		super(make, model, price);
		this.engineType = engineType;
		this.numberOfDoors = numberOfDoors;
	}
	
	
	
	
	

	
	
	

	

	

}
