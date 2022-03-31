package com.solvd.laba.real_state_agency;

public class Office extends Building {
	private boolean multiOffice = getHasCaracteristic();
	
	public Office(int hID, String adress, int superface, boolean hasCaracteristic) {
		super(hID, adress, superface, hasCaracteristic);
	}
	
	//setters
	public void setmultiOffice(boolean multiOffice) {
		this.multiOffice = multiOffice;
	}
	
	//getters
	public boolean getUniqueOffice() {
		return multiOffice;
	}
	
}
