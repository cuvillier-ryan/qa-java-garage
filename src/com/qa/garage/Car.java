package com.qa.garage;

public class Car extends Vehicle {

	private String engineType;
	private int numberOfDoors;

	public Car() {
		super();
		this.engineType = "???";
		this.numberOfDoors = 0;
	}

	public Car(int id, String make, String model, double price, String engineType, int numberOfDoors) {
		super(id, make, model, price);
		this.engineType = engineType;
		this.numberOfDoors = numberOfDoors;
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
