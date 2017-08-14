package com.meirapentermann.jets;

import java.util.ArrayList;

public class Fleet {
	private ArrayList<Jet> planes;
	
	/*
	 * Constructors
	 */
	public Fleet() {
	}

	public Fleet(ArrayList<Jet> planes) {
		for(int i = 0; i < planes.size(); i++) {
			if (planes.get(i)==null) {
				planes.remove(i);
			}
		}
		this.planes = planes;
	}
	
	/*
	 * Getters & Setters
	 */

	public ArrayList<Jet> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<Jet> planes) {
		for(int i = 0; i < planes.size(); i++) {
			if (planes.get(i)==null) {
				planes.remove(i);
			}
		}
		this.planes = planes;
	}
	
	/*
	 * Calculates fastest plane in fleet
	 */
	
	public Jet fastestInFleet() {
		ArrayList<Jet> aList = this.getPlanes();
		if(aList.size()==0) {
			return null;
		}
		else {
			Jet fastest = aList.get(0);
			for (int i = 1; i < aList.size(); i++) {
				fastest = aList.get(i).compareSpeedFast(aList.get(i-1));
			}
			return fastest;	
		}
	}
	
	/*
	 * Calculates plane in fleet with longest range
	 */
	
	public Jet longestRange() {
		ArrayList<Jet> aList = this.getPlanes();
		if(aList.size()==0) {
			return null;
		}
		else {
			Jet longest = aList.get(0);
			for (int i = 1; i < aList.size(); i++) {
				longest = aList.get(i).compareRangeLong(aList.get(i-1));
			}
			return longest;	
		}
	}
	
	/*
	 * appends the ArrayList<Jet> to add a new plane
	 */
	public void appendFleet(Jet j) {
		if(!(j==null)) {
			ArrayList<Jet> aList = this.getPlanes();
			aList.add(j);
			this.setPlanes(aList);
		}
	}

	/*
	 * Adds numbers as it prints out fleet, so user can choose
	 */
	@Override
	public String toString() {
		ArrayList<Jet> aList = this.getPlanes();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < aList.size(); i++) {
			if(!(aList.get(i) == null)) {
				sb.append(i+1);
				sb.append(": ");
				sb.append(aList.get(i));
			}
		}
		return sb.toString();
	}
	
	

}
