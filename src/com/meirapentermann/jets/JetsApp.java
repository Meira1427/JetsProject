package com.meirapentermann.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class JetsApp {
	static boolean active = true;

	public static void main(String[] args) {
		int choice;
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> menuOptions = new ArrayList<String>();
		menuOptions.add("1. List Fleet");
		menuOptions.add("2. View Fastest Jet");
		menuOptions.add("3. View Jet With Longest Range");
		menuOptions.add("4. Add Jet to Fleet");
		menuOptions.add("5. Quit");
		
		Jet j1  = new Jet("Boeing 797", 900, 3000, 300);
		Jet j2 = new Jet("Cessna XYZ", 500, 1500, 20);
		ArrayList<Jet> jets = new ArrayList<Jet>();
		jets.add(j1);
		jets.add(j2);
		jets.add(null);
		Fleet myFleet = new Fleet(jets);
		
		while(active) {
			JetMenu menu = new JetMenu(menuOptions);
			menu.printMenu("* * * * * Java Bean Air * * * * *");
			choice = menu.returnValidMenuOption(keyboard, -1, menu.getNumOptions());
			navigateMenu(choice, myFleet);
		}
	}
	
	public static void navigateMenu(int num, Fleet aList) {
		System.out.println();		
		switch(num) {
		case 1:
			System.out.println("Java Bean Air's Fleet");
			System.out.println(aList);
			break;
		case 2:
			System.out.println("The fastest in our fleet is: ");
			System.out.println(aList.fastestInFleet());
			break;
		case 3:
			System.out.println("The longest range in our fleet is: ");
			System.out.println(aList.longestRange());
			break;
		case 4:
			System.out.println("Adding a jet. . . (coming soon)");
			System.out.println();
			break;
		case 5:
			System.out.println("Thank you for choosing Java Bean Air");
			active = false;
			break;
		default:
			break;
		}	
	}
}
