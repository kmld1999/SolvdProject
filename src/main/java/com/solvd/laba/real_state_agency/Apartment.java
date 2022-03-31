package com.solvd.laba.real_state_agency;

public class Apartment extends Building {
	private boolean uniqueRoom = getHasCaracteristic();

	public Apartment(int hID, String adress, int superface, boolean hasCaracteristic) {
		super(hID, adress, superface, hasCaracteristic);
	}
	
	//setters
	public void setUniqueRoom(boolean uniqueRoom) {
		this.uniqueRoom = uniqueRoom;
	}
	
	//getters
	public boolean getUniqueRoom() {
		return uniqueRoom;
	}
	
}
