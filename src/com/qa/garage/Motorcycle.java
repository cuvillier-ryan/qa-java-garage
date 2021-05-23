package com.qa.garage;

public class Motorcycle extends Vehicle {

	private String engineType;

	public Motorcycle() {
		super();
		this.engineType = "???";
	};

	public Motorcycle(int id, String make, String model, double price, String engineType) {
		super(id, make, model, price);
		this.engineType = engineType;
	}

	@Override
	public void honk() {
		System.out.println("Tuut tuut!");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating");

	}

	@Override
	public void brake() {
		System.out.println("Braking");
	}

}
