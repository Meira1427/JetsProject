package com.meirapentermann.jets;

public class Pilot {
	private String firstName;
	private String lastName;
	private String nickName;
	private String prevAirline;
	private String favorite;
	private boolean assigned;
	
	public Pilot() {
	}

	public Pilot(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Pilot(String firstName, String lastName, String nickName) {
		this(firstName, lastName);
		this.nickName = nickName;
	}
	
	public Pilot(String firstName, String lastName, String nickName, String prevAirline, String favorite) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.prevAirline = prevAirline;
		this.favorite = favorite;
	}

	public String returnFullName() {
		StringBuilder sb = new StringBuilder("");
		String fn = getFirstName();
		String nick = getNickName();
		String ln = getLastName();
		if(fn != null) {
			sb.append(fn);
			sb.append(" ");
		}
		if(nick != null) {
			sb.append("'");
			sb.append(nick);
			sb.append("'");
			sb.append(" ");
		}
		if(ln != null) {
			sb.append(ln);
		}
		return sb.toString();
	}
	
	/*
	 * To be used when user asks about Pilot of Jet he/she chartered
	 */
	
	public void printPilotFullInfo () {
		System.out.println("* * * * * * *  Your  Pilot  * * * * * * *");
		System.out.println();
		System.out.println("  " + this.returnFullName());
		System.out.println("  " + "Previous Airline: " + this.getPrevAirline());
		System.out.println("  " + "Favorite Thing About Java Bean Air:");
		System.out.println("    " + this.getFavorite());
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println();
	}
	
	/*
	 * Getters & Setters
	 */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPrevAirline() {
		return prevAirline;
	}

	public void setPrevAirline(String prevAirline) {
		this.prevAirline = prevAirline;
	}
	
	public String getFavorite() {
		return favorite;
	}

	public void setFavorite (String favorite) {
		this.favorite = favorite;
	}

	public boolean getAssigned() {
		return assigned;
	}
	
	public void setAssigned (boolean bool) {
		this.assigned = bool;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("");
		if (firstName != null) {
			builder.append(firstName);
			builder.append(" ");
		}
		if (lastName != null) {
			builder.append(lastName);
		}
		return builder.toString();
	}


}
