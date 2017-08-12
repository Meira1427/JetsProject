package com.meirapentermann.jets;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class JetsApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice;
		boolean active = true;
		ArrayList<String> menuOptions = new ArrayList<String>();
		menuOptions.add("1. List Fleet");
		menuOptions.add("2. View Fastest Jet");
		menuOptions.add("3. View Jet With Longest Range");
		menuOptions.add("4. Add Jet to Fleet");
		menuOptions.add("5. Quit");
		
		Jet j1  = new Jet("Test Jet 1", 600, 3000, 30);
		Jet j2 = new Jet("Test Jet 2", 500, 4000, 200);
		ArrayList<Jet> jets = new ArrayList<Jet>();
		jets.add(j1);
		jets.add(j2);
		jets.add(null);
		Fleet myFleet = new Fleet(jets);
		
		while(active) {
			JetMenu menu = new JetMenu(menuOptions);
			menu.printMenu();
			choice = menu.returnValidMenuOption(keyboard, -1, menu.getNumOptions());
			System.out.println(myFleet);
			active = false;
		}
	}

}
