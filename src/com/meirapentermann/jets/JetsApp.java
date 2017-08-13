package com.meirapentermann.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class JetsApp {
	static boolean active = true;
	static int userJetChoice = 0;

	public static void main(String[] args) {
		int choice;
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> menuOptions = new ArrayList<String>();
		
		menuOptions.add("1. List Fleet");
		menuOptions.add("2. View Fastest Jet");
		menuOptions.add("3. View Jet With Longest Range");
		menuOptions.add("4. Add Jet to Fleet");
		menuOptions.add("5. Charter a Jet");
		menuOptions.add("6. Meet your pilot");
		menuOptions.add("7. Quit");
	
		Jet j2 = new Jet("Cessna 444", 690, 4500,  14, 34.9);
		Jet j1 = new Jet("Boeing 797", 600, 9000, 500, 357.0);
		Jet j3 = new Jet("Airbus A390", 550, 5000, 400, 428.0);
		Jet j4 = new Jet("Lockheed W2", 720, 3800, 350, 349.9);
		Jet j5 = new Jet("Northrup Echo", 475, 5300, 315, 249.9);
		
		
		ArrayList<Jet> jets = new ArrayList<Jet>();
		jets.add(j1);
		jets.add(j2);
		jets.add(j3);
		jets.add(j4);
		jets.add(j5);
		
		Fleet myFleet = new Fleet(jets);
		
		Roster jbRoster = new Roster();
		jbRoster.hirePilots();
		jbRoster.assignPilotsToFleet(myFleet);
		
		while(active) {
			JetMenu menu = new JetMenu(menuOptions);
			menu.printMenu("* * * * * Java Bean Air * * * * *");
			choice = menu.returnValidOption(keyboard, -1, menu.getNumOptions(), "Choose a Valid Menu Option: ");
			navigateMenu(choice, myFleet, menu, keyboard);
		}
	}
	
	public static void navigateMenu(int num, Fleet aList, JetMenu menu, Scanner sc) {
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
			Jet newJet = menu.promptForJetInfo(sc);
			aList.appendFleet(newJet);
			break;
		case 5:
			ArrayList<Jet> jets = aList.getPlanes();
			userJetChoice = menu.promptForJetChoice(sc, aList);
			System.out.println("Good choice:\n" + jets.get((userJetChoice-1)));
			System.out.println();
			break;
		case 6:
			System.out.println("Meet you pilot. . . coming soon");
			System.out.println();
			break;
		case 7:
			System.out.println("Thank you for choosing Java Bean Air");
			active = false;
			break;
		default:
			break;
		}	
	}
	
}
