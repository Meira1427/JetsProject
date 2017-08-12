package com.meirapentermann.jets;

public class Jet {
	private String model;
	private double speed;
	private double range;
	private int capacity;
	private double price;

	// private Pilot assignedPilot;
	
	
	/*Two Constructors
	 * no-args constructor
	 * constructor that takes 4 fields
	 */
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
		
	/* Compares speed of current Jet object with Jet object
	 * passed as parameter. Returns Jet object with faster
	 * speed.
	 */
	public Jet compareSpeedFast(Jet other) {
		Jet answer;
		answer = (this.getSpeed() > other.getSpeed()) ? this : other;
		return answer;								
	}
	
	
	/* Compares range of current Jet object with Jet object
	 * passed as parameter. Returns Jet object with longer
	 * range.
	 */
	public Jet compareRangeLong(Jet other) {
		Jet answer;
		answer = (this.getRange() > other.getRange()) ? this : other;
		return answer;
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
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [");
		if (model != null) {
			builder.append("model=");
			builder.append(model);
			builder.append(", ");
		}
		builder.append("speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append("]\n");
		return builder.toString();
	}

}
