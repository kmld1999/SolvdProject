package com.solvd.laba.real_state_agency;

public class House extends Building {
	private boolean hasHouseYard = getHasCaracteristic();

	public House(int hID, String adress, int superface, boolean hasCaracteristic) {
		super(hID, adress, superface, hasCaracteristic);
	}

	//setters
	public void setHasHouseYard(boolean hasHouseYard) {
		this.hasHouseYard = hasHouseYard;
	}
	
	//getters
	public boolean getHasHouseYard() {
		return hasHouseYard;
	}
	
}
