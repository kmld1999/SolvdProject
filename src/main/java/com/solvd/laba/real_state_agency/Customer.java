package com.solvd.laba.real_state_agency;

import java.util.ArrayList;
import com.solvd.laba.real_state_agency.exceptions.InvalidAmountException;
import com.solvd.laba.real_state_agency.exceptions.InvalidNumberException;
import com.solvd.laba.real_state_agency.interfaces.IBuyable;
import com.solvd.laba.real_state_agency.interfaces.IRent;

public class Customer extends Person implements IRent, IBuyable {
	private int salary;
	private int moneyAvailable;
	ArrayList<Building> properties = new ArrayList<Building>();
	
	
	//constructor
	public Customer(int pID, String pName, String pTelephone) {
		super(pID, pName, pTelephone);
	}
	
	//setters
	public void setSalary(int salary) {
		if (salary < 0) {
			throw new InvalidNumberException();
		}
		this.salary = salary;
	}
	public void setMoneyAvailable(int moneyAvailable) {
		if (moneyAvailable < 0) {
			throw new InvalidNumberException();
		}
		this.moneyAvailable = moneyAvailable;
	}
	
	//getters
	public int getSalary() {
		return salary;
	}
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
	public void rent() {
		System.out.println("I want to rent a property.");
	}
	
}
