package com.meirapentermann.jets;

public class Jet {
	private String model;
	private double speed;
	private double range;
	private int capacity;

	// private Pilot assignedPilot;
	
	public Jet() {
		super();
		this.model="Define Model";
	}
	
	public Jet(String model, double speed, double range, int capacity) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
