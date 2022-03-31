package com.solvd.laba.real_state_agency;

import java.util.ArrayList;

import com.solvd.laba.real_state_agency.exceptions.InvalidAmountException;
import com.solvd.laba.real_state_agency.exceptions.InvalidNumberException;
import com.solvd.laba.real_state_agency.interfaces.IBuyable;
import com.solvd.laba.real_state_agency.interfaces.ICollectRent;

public class Owner extends Person implements IBuyable, ICollectRent {
	private int moneyAvailable;
	ArrayList<Building> properties = new ArrayList<Building>();
	
	//constructor
	public Owner(int pID, String pName, String pTelephone) {
		super(pID, pName, pTelephone);
	}
	
	//setters
	public void setMoneyAvailable(int moneyAvailable) {
		if (moneyAvailable < 0) {
			throw new InvalidNumberException();
		}
		this.moneyAvailable = moneyAvailable;
	}
	
	//getters
	public int getMoneyAvailable() {
		return moneyAvailable;
	}

	@Override
	public void buy(int propertyPrice, Building property) {
		if (moneyAvailable < propertyPrice) {
			throw new InvalidAmountException();
		} 
		moneyAvailable = moneyAvailable - propertyPrice;
		properties.add(property);
		System.out.println(properties.get(0).getAdress());
	}

	@Override
	public void collectRent() {
		System.out.println("I came for collecting the rent.");
	}

}
