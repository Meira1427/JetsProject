# Jets Project

## Description
This project is a fleet of Jet objects. Jets can have pilots. Jets must have a model, speed, range, and price associated with them. The speed should be taken in MPH but displayed to the user in Mach.

## Topics Covered
* Object-oriented design
* ArrayLists
* UML
* JUnit
* Test-Driven Development

## Classes and Methods

### Jet Class

#### Instance Variables
model, speed,  range, capacity, price, assignedPilot (Pilot Class)

#### compareSpeedFast(Jet other)
Takes in a jet to compare to current Jet.
Returns Jet which is faster.

#### compareRangeLong(Jet other)
Takes in a jet to compare to current Jet.
Returns Jet which has longer range.

#### assignPilot(Roster r1)
Takes in a Roster of Pilot objects. Checks to see if there are any who are not already assigned to a jet. If one is available, assigns it to that Jet. If not, enters new pilot with name "Pilot to Hire"

#### Getters, Setters, and toString()
Average Getters and Setters. toString() adds in identifiers for fields like "mach", "miles", and "million" where appropriate.

### Fleet Class

#### Instance Variables
Just an ArrayList of Jet objects.

#### fastestInFleet()
Returns a Jet object, the fastest in the fleet.

#### longestRange()
Returns a Jet object, the one with the longest range in the fleet.

#### appendFleet(Jet j)
Takes in a Jet object and adds it to the fleet.

#### Getters, Setters, & toString()
The setter removes any null Jets from the ArrayList of Jet objects before assigning that ArrayList to the fleet. toString() adds 1, 2, etc next to the jets as they print, so user can identify by number.

### JetMenu Class
This class contains useful items for building a menu and interacting with the user.

#### Instance Variables
An ArrayList of Strings to identify the options in a menu.

#### printMenu() & printMenu(String header)
An overloaded method which allows user to add an optional header before the menu prints

#### returnCleanInt, returnCleanDouble,  returnUserString, & returnValidOption
Passing in Scanner and prompt, requests an int, double, or String from user. returnValidOption also asks for range of valid options, so user cannot choose a menu option or a plane that is not available to choose.

#### promptForJetInfo(Scanner sc)
using above methods, allows this class to prompt user for info on new jet. Converts mph to mach and rounds that number. Returns a Jet object.

#### promptForJetChoice(Scanner sc, Fleet f1)
using prompting methods and forcing user to choose only one of the numbers listed for total number in Fleet. Returns an int = user choice.

### Pilot Class

#### Instance Variables
firstName, lastName, nickName, previousAirline, favorite (thing about Java Bean Air), assigned (boolean)

#### returnFullName()
returns full name including nickName as a String.

#### printPilotFullInfo ()
prints out little info square with fullName of Pilot, his previousAirline, and his favorite thing about Java Bean Air.

#### Getters & Setters & toString()
toString only prints first and last name for the full Fleet print view.

### Roster Class

#### Instance Variables
Just an ArrayList of Pilot objects.

#### assignPilotsToFleet(Fleet fleet)
Takes in a Fleet. If there are no Jets, prints message "Buy more Jets". If there are less pilots on the current roster than can staff the planes, prints message "Hire more pilots". Otherwise, generates a random number and only assigns one pilot to one plane. As it assigns them, it changes their "assigned" variable to true.

#### hirePilots()
fills a roster with goofy pilot names.
Returns void. Just affects current roster.

### JetsApp (The Main)

#### Static Variables
active (boolean) & userJetChoice (for chartering)

#### Set Up
Imports Scanner, creates new JetMenu object and fills with choices, creates a new Fleet object, initialized with an ArrayList of 5 Jet objects, creates a new Roster of Pilot objects.

#### Loop (until user Quits)
prints out menu, takes user's menu choice, navigates the menu choices, may pause if data is printed to screen

#### Navigate Menu
A switch statement of 7 choices
