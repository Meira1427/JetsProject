package com.meirapentermann.jets;

import java.util.ArrayList;

public class Fleet {
	private ArrayList<Jet> planes;
	
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

	public ArrayList<Jet> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<Jet> planes) {
		this.planes = planes;
	}
	
	public Jet fastestInFleet() {
		return null;
	}
	
	public Jet longestRange() {
		return null;
	}

	@Override
	public String toString() {
		ArrayList<Jet> aList = this.getPlanes();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < aList.size(); i++) {
			if(!(aList.get(i) == null)) {
				sb.append(aList.get(i));
			}
		}
		return sb.toString();
	}
	
	

}
