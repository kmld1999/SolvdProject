package com.solvd.laba.real_state_agency;

public class Premises extends Building {
	private boolean industriesType = getHasCaracteristic();
	
	public Premises(int hID, String adress, int superface, boolean hasCaracteristic) {
		super(hID, adress, superface, hasCaracteristic);
	}
	
	//setters
	public void setIndustriesType(boolean industiresType) {
		this.industriesType = industiresType;
	}
	
	//getters
	public boolean getIndustriesType() {
		return industriesType;
	}
	
}
