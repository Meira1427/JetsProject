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
		
		while(active) {
			JetMenu menu = new JetMenu(menuOptions);
			menu.printMenu();
			choice = menu.returnValidMenuOption(keyboard, -1, menu.getNumOptions());
			
			active = false;
		}
	}

}
