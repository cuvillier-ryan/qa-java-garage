package com.qa.garage;

public class Truck extends Vehicle {

	private String engineType;
	private boolean fourWheelDrive;

	public Truck() {
		super();
		this.engineType = "???";
		this.fourWheelDrive = false;

	}

	public Truck(int id, String make, String model, double price, String engineType, boolean fourWheelDrive) {
		super(id, make, model, price);
		this.engineType = engineType;
		this.fourWheelDrive = fourWheelDrive;
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
