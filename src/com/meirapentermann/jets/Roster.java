package com.meirapentermann.jets;

import java.util.ArrayList;

public class Roster {
	private ArrayList<Pilot> pList;
	
	public Roster() {
	}

	public Roster(ArrayList<Pilot> pList) {
		super();
		this.pList = pList;
	}

	public ArrayList<Pilot> getpList() {
		return pList;
	}

	public void setpList(ArrayList<Pilot> pList) {
		this.pList = pList;
	}
	
	public void assignPilotsToFleet(Fleet fleet) {
		ArrayList<Pilot> pilots = getpList();
		ArrayList<Jet> jets = fleet.getPlanes();
		if(jets.size() == 0) {
			System.out.println("Buy more planes.");
		}
		if(jets.size() > pilots.size()) {
			System.out.println("Hire more pilots.");
		}
		else {
			for (int i = 0; i < jets.size(); i++) {
				int num = (int)(Math.random()*pilots.size());
				while(pilots.get(num).getAssigned()==true) {
					num = (int)(Math.random()*pilots.size());
				}
				jets.get(i).setPilot(pilots.get(num));
			}
		}
		
		/* 
		 * String temp = null;
		int num;
		while(temp==null) {
			num = (int)(Math.random()*dogNames.length);
			temp = dogNames[num];
			if(dogNames[num] != null) {
				dogNames[num] = null;
			}
		}
		return temp;
		 * 
		 * */
		
	}
	
	public void hirePilots() {
		
	}

}
