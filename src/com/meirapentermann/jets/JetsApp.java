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
		
		Fleet jbFleet = new Fleet(jets);
		
		Roster jbRoster = new Roster();
		jbRoster.hirePilots();
		jbRoster.assignPilotsToFleet(jbFleet);
		
		JetMenu menu = new JetMenu(menuOptions);
		
		while(active) {
			System.out.println();
			menu.printMenu("* * * * * Java Bean Air * * * * *");
			choice = menu.returnValidOption(keyboard, -1, menu.getNumOptions(), "Choose a Valid Menu Option: ");
			navigateMenu(choice, jbFleet, jbRoster, menu, keyboard);
			if (choice != 7) {
				System.out.print("Enter c to continue> ");
				keyboard.next();
			}
		}
	}
	
	public static void navigateMenu(int num, Fleet fl1, Roster r1, JetMenu menu, Scanner sc) {
		System.out.println();		
		switch(num) {
		case 1:
			System.out.println("Java Bean Air's Fleet");
			System.out.println(fl1);
			break;
		case 2:
			System.out.println("The fastest in our fleet is: ");
			System.out.println(fl1.fastestInFleet());
			break;
		case 3:
			System.out.println("The longest range in our fleet is: ");
			System.out.println(fl1.longestRange());
			break;
		case 4:
			Jet newJet = menu.promptForJetInfo(sc);
			newJet.assignPilot(r1);
			fl1.appendFleet(newJet);
			break;
		case 5:
			ArrayList<Jet> jets = fl1.getPlanes();
			userJetChoice = menu.promptForJetChoice(sc, fl1);
			System.out.println("Good choice:\n" + jets.get((userJetChoice-1)));
			break;
		case 6:
			if ((userJetChoice - 1) < 0) {
				System.out.println("You need to charter a jet first.");
				System.out.println();
			}
			else {
				ArrayList<Jet> j = fl1.getPlanes();
				Pilot p1 = j.get((userJetChoice-1)).getPilot();
				p1.printPilotFullInfo();
			}
			break;
		case 7:
			System.out.println("*** Thank you for choosing Java Bean Air ***");
			System.out.println();
			active = false;
			break;
		default:
			break;
		}	
	}
	
}
