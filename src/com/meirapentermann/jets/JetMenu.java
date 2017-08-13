package com.meirapentermann.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class JetMenu {
	private ArrayList<String> optionsList;
	
	/* Two Constructors
	 * no-args constructor plus a constructor that takes String array only
	 */
	public JetMenu() {
	}

	public JetMenu(ArrayList<String> aList) {
		setOptionsList(aList);
	}
	
	/* Prints ArrayList. 
	 * There should be no nulls printed
	 */
	public void printMenu() {
		if(this.getNumOptions() == 0) {
			System.out.println("Nothing to Print");
		}
		else {
			ArrayList<String> arr = this.getOptionsList();
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}
		System.out.println();
	}
	
	/*overload the print method with option to print header
	 */
	
	public void printMenu(String header) { 
		System.out.println(header);
		System.out.println();
		this.printMenu();
	}
	
	public int returnCleanInt(Scanner sc, String prompt) {
		System.out.print(prompt);
		while(!sc.hasNextInt()) {
			System.out.print("Enter only a number: ");
			sc.next();
		}
		return sc.nextInt();
	}
	
	public int returnValidMenuOption(Scanner sc, int num, int max) {
		while(num<0 || num > max) {
			num = returnCleanInt(sc, "Choose a Valid Menu Option: ");
		}
		return num;
	}
	
	public double returnCleanDouble(Scanner sc, String prompt) {
		System.out.print(prompt);
		while(!sc.hasNextDouble()) {
			System.out.print("Enter only a number: ");
			sc.next();
		}
		return sc.nextDouble();
	}
	
	public String returnUserString(Scanner sc, String prompt) {
		System.out.println(prompt);
		sc.nextLine();
		String temp = sc.nextLine();
		return temp;
	}
	
	public int getNumOptions() {
		ArrayList<String> aList = getOptionsList();
		if(aList==null) {
			return 0;
		}
		else {
			return aList.size();
		}
	}

	public ArrayList<String> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(ArrayList<String> aList) {
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) == null) {  
				aList.remove(i);		  //remove nulls and return smaller list if necessary
			}						  
		}
		this.optionsList = aList;
	}
	
	public Jet promptForJetInfo(Scanner sc) {
		String model = returnUserString(sc, "Enter the Model: ");
		int speed = returnCleanInt(sc, "Enter the Speed (mph): ");
		int range = returnCleanInt(sc, "Enter the Range (miles): ");
		int cap = returnCleanInt(sc, "Enter the Capacity (people): ");
		double price = returnCleanDouble(sc, "Enter the Price (US mill): ");
		Jet j = new Jet(model, speed, range, cap, price);
		return j;
	}
	

}
