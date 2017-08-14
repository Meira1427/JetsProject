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
	
	/*
	 * For interacting with the user and getting valid
	 * information (int, double, string) from user
	 */
	
	public int returnCleanInt(Scanner sc, String prompt) {
		System.out.print(prompt);
		while(!sc.hasNextInt()) {
			System.out.print("Enter only a number: ");
			sc.next();
		}
		return sc.nextInt();
	}
	
	public int returnValidOption(Scanner sc, int num, int max, String prompt) {
		while(num<0 || num > max) {
			num = returnCleanInt(sc, prompt);
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
	
	
	/*
	 * Getters & Setters
	 */
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
	
	/*
	 * Since my methods for prompting user for clean int, double, etc
	 * are in this class,this seemed like a good place to put the prompting 
	 * for info on new Jet to add to fleet. 
	 * Takes info from user w/ Scanner. Converts mph to mach and rounds. 
	 * Returns a Jet.
	 */
	
	public Jet promptForJetInfo(Scanner sc) {
		String model = returnUserString(sc, "Enter the Model: ");
		int speed = returnCleanInt(sc, "Enter the Speed (mph): ");
		int range = returnCleanInt(sc, "Enter the Range (miles): ");
		int cap = returnCleanInt(sc, "Enter the Capacity (people): ");
		double price = returnCleanDouble(sc, "Enter the Price (US mill): ");
		double speedM = speed*.00130332;
		speedM = Math.floor(speedM*100)/100;
		Jet j = new Jet(model, speedM, range, cap, price);
		return j;
	}
	
	
	/*
	 * prompts user to choose a jet from list using number.
	 * Returns int, a valid user choice.
	 */
	public int promptForJetChoice(Scanner sc, Fleet f1) {
		System.out.println(f1);
		int num = returnValidOption(sc, -1, f1.getPlanes().size(), "Choose a jet: ");
		return num;
	}
	
}
