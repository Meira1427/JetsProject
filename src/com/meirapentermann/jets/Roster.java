package com.meirapentermann.jets;

import java.util.ArrayList;

public class Roster {
	private ArrayList<Pilot> pList;
	
	/*
	 * Constructors
	 */
	public Roster() {
	}

	public Roster(ArrayList<Pilot> pList) {
		super();
		this.pList = pList;
	}

	/*
	 * Getters & Setters
	 */
	public ArrayList<Pilot> getpList() {
		return pList;
	}

	public void setpList(ArrayList<Pilot> pList) {
		this.pList = pList;
	}
	
	/*
	 * Takes in a fleet and randomly assigns pilots provided there are enough.
	 * If there are zero Jets, prints the message "Buy more planes."
	 * If there are less pilots than Jets, prints message "Hire more pilots."
	 * Otherwise, generates a random number and only assigns a Pilot to 1 Jet
	 */
	
	public void assignPilotsToFleet(Fleet fleet) {
		ArrayList<Pilot> pilots = getpList();
		ArrayList<Jet> jets = fleet.getPlanes();
		if(jets.size() == 0) {
			System.out.println("Buy more planes.");
		}
		else if(jets.size() > pilots.size()) {
			System.out.println("Hire more pilots.");
		}
		else {
			for (int i = 0; i < jets.size(); i++) {
				int num = (int)(Math.random()*pilots.size());
				//System.out.println(num); //for testing
				while(pilots.get(num).getAssigned()==true) {
					num = (int)(Math.random()*pilots.size());
					//System.out.println(num); //for testing
				}
				jets.get(i).setPilot(pilots.get(num));
				pilots.get(num).setAssigned(true);
			}
		}	
	}
	
	/*
	 * Hire Pilots. Will fill a roster with names;
	 */
	
	public void hirePilots() {
		Pilot p1 = new Pilot("Johnny", "Farthington", "FoxTrot", "USAF", "Emergency Landings");
		Pilot p2 = new Pilot("Bob", "DaPlane", "Throw \'em Off", "United", "The Passengers Behave");
		Pilot p3 = new Pilot("Hugh", "Winston", "Harvard Man", "Spirit", "Our First Class Snacks");
		Pilot p4 = new Pilot("Billy", "Poteet", "Roll Tide", "Delta", "Them Little Packets of Prezles");
		Pilot p5 = new Pilot("Joan", "Smith", "That's Right", "Frontier", "We Take Off on Time");
		Pilot p6 = new Pilot("Jean Luke", "Picard", "Number One", "Starfleet", "We Have Seatbelts on the Bridge");
		Pilot p7 = new Pilot("George", "Caroll", "the Colonel", "USAF", "We Do Things By the Book");
		Pilot p8 = new Pilot("Thomas", "Cruisin", "Top Gun", "Southwest", "We Feel the Need for Speed");
		ArrayList<Pilot> pilots = new ArrayList<Pilot>();
		pilots.add(p1);
		pilots.add(p2);
		pilots.add(p3);
		pilots.add(p4);
		pilots.add(p5);
		pilots.add(p6);
		pilots.add(p7);
		pilots.add(p8);
		this.setpList(pilots);
	}
	
	/*
	 * Currently unused. I thought I would need this, but I'm saving it for now
	 */
	
	public Pilot returnMatch(String name) {
		ArrayList<Pilot> pilots = this.getpList();
		Pilot p = new Pilot("No Match", "Found");
		for (int i = 0; i < pilots.size(); i++) {
			if (pilots.get(i).toString().equals(name)) {
				p = pilots.get(i);
			}
		}
		return p;
	}

}
