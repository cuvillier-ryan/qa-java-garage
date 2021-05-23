package com.qa.garage;

public abstract class Vehicle implements VehicleInterface {
	
	private int id;
	private String make;
	private String model;
	private double price;
	
	
	public Vehicle() {
		this.make = "???";
		this.model = "???";
		this.price = 0;
	}
	
	public Vehicle(int id, String make, String model, double price) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.price = price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", price=" + price + "]";
	}

	
	
}
