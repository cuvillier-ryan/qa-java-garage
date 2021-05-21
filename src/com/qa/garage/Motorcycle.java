package com.qa.garage;

public class Motorcycle extends Vehicle {
	
	private String engineType;

	public Motorcycle() {
		super();
		this.engineType = "???";
	};

	public Motorcycle(String make, String model, double price, String engineType) {
		super(make, model, price);
		this.engineType = engineType;
	}
	
	
	
	

}
