package com.qa.garage;

public class Vehicle {
	
	private String make;
	private String model;
	private double price;
	
	
	public Vehicle() {
		this.make = "???";
		this.model = "???";
		this.price = 0;
	}
	
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public void honk() {
		System.out.println("Tuut tuut!");
	}

	public String getVehicleName() {
		return make + " " + model;
	}
	
	public double getPrice() {
		return price;
	}
	
}
