package com.solvd.laba.real_state_agency;

public class Building {
	private int hID;
	private String adress;
	protected int superface;
	private Zone zoneName;
	private boolean hasCaracteristic;
	private int rentPrice;
	
	//constructor
	public Building(int hID, String adress, int superface, boolean hasCaracteristic) {
		this.hID = hID;
		this.adress = adress;
		this.superface = superface;
		this.hasCaracteristic = hasCaracteristic;
	}
	
	//setters
	public void setHID(int hID) {
		this.hID = hID;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setSuperface(int superface) {
		this.superface = superface;
	}
	public void setZone(Zone zoneName) {
		this.zoneName = zoneName;
	}
	public void setHasCaracteristic(boolean hasCaracteristic) {
		this.hasCaracteristic = hasCaracteristic;
	}
	public void setRentPrice(int rentPrice) {
		this.rentPrice = getSuperface() * getZoneName().getZonePrice();
	}

	//getters
	public int setHID() {
		return hID;
	}
	public int getSuperface() {
		return superface;
	}
	public Zone getZoneName() {
		return zoneName;
	}
	public String getAdress() {
		return adress;
	}
	public boolean getHasCaracteristic() {
		return hasCaracteristic;
	}
	public int getRentPrice() {
		return rentPrice;
	}
	
	
}

