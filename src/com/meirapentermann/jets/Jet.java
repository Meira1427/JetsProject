package com.meirapentermann.jets;

import java.util.ArrayList;

public class Jet {
	private String model;
	private double speed;
	private int range;
	private int capacity;
	private double price;
	private Pilot assignedPilot;
	
	
	/*Two Constructors
	 * no-args constructor
	 * constructor that takes 4 fields
	 */
	public Jet() {
		super();
		this.model="Define Model";
	}
	
	public Jet(String model, double speed, int range, int capacity, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.price = price;
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
	
	/* If there are pilots available, assign one
	 * Otherwise set pilot name to "Pilot to Hire"
	 */
	public void assignPilot(Roster r1) {
		ArrayList<Pilot> pilots = r1.getpList();
		boolean found = false;
		for (int i = 0; i < pilots.size(); i++) {
			if(pilots.get(i).getAssigned() == false) {
				this.setPilot(pilots.get(i));
				pilots.get(i).setAssigned(true);
				found = true;
				break;
			}
		}
		if (!found){
			Pilot p = new Pilot("Pilot", "to Hire");
			this.setPilot(p);
		}
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

	public int getRange() {
		return range;

	}

	public void setRange(int range) {
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

	public Pilot getPilot() {
		return assignedPilot;
	}
	
	public void setPilot(Pilot pilot) {
		this.assignedPilot = pilot;
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
		builder.append(" mach, ");
		builder.append("range=");
		builder.append(range);
		builder.append(" miles, ");
		builder.append("capacity=");
		builder.append(capacity);
		builder.append(", price=");
		builder.append(price);
		builder.append(" million");
		if (assignedPilot != null) {
			builder.append(", pilot=");
			builder.append(assignedPilot);
		}
		builder.append("]\n");
		return builder.toString();
	}

}
