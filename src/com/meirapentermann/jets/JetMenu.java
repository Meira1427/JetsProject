package com.meirapentermann.jets;

import java.util.ArrayList;

public class JetMenu {
	private int numOptions;
	private ArrayList<String> optionsList;
	
	
	/* Two Constructors
	 * no-args constructor plus a constructor that takes String array only
	 * protects from someone entering more options than exist in array
	 */
	public JetMenu() {
	}

	public JetMenu(ArrayList<String> aList) {
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) == null) {
				aList.remove(i);
			}
		}
		setNumOptions(aList.size());
		setOptionsList(aList);
	}
	
	/* Prints ArrayList. There should be no 
	 * 
	 */
	public void printMenu() {
		if(this.getNumOptions() == 0) {
			System.out.println("Nothing to Print");
		}
		else {
			ArrayList arr = this.getOptionsList();
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}
	}

	public int getNumOptions() {
		return numOptions;
	}

	public void setNumOptions(int numOptions) {
		this.numOptions = numOptions;
	}

	public ArrayList<String> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(ArrayList<String> aList) {
		this.optionsList = aList;
	}

}
