package com.solvd.laba.real_state_agency;

import java.util.Scanner;
import java.util.LinkedList;
import com.solvd.laba.real_state_agency.exceptions.InvalidOptionException;
import com.solvd.laba.real_state_agency.exceptions.NullBuildingException;

public class Main {
	public static void main(String[] args) throws InvalidOptionException {
		Scanner input = new Scanner(System.in);
		
		//I set some values for testing:
		Customer cust1 = new Customer(42189423, "Keith Denysiuk", "3735404649");
		Owner own1 = new Owner(42222597, "Bruno Diaz", "3773508669");
		House how1 = new House(11111, "58 Matheu St, Cnel Du Graty, Chaco", 150, true);
		Apartment apt1 = new Apartment(21112, "1150 Las Heras Avenue, Resistencia, Chaco", 50, false);
		Apartment apt2 = new Apartment(21113, "545 Jose Marmol St, Resistencia, Chaco", 30, true);
		Zone downtownArea = new Zone("Downtown Area", 750);
		Zone residentialArea = new Zone("Residential Area", 500);
		Zone suburbanArea = new Zone("Suburban Area", 250);
		

		how1.setZone(residentialArea);
		how1.setRentPrice(how1.getSuperface());
		apt1.setZone(suburbanArea);
		apt1.setRentPrice(apt1.getSuperface());
		apt2.setZone(downtownArea);
		apt2.setRentPrice(apt1.getSuperface());
		
		//the owner has got the following properties:
		//cust1.buy(5000, apt2);
		
		int properties;
		properties = 3;
		
		Building[] arrBuilding = new Building[properties];
		
		arrBuilding[0] = how1;
		arrBuilding[1] = apt1;
		arrBuilding[2] = apt2;
		
		int choise;
		String choise2;
		boolean choise3 = false;
		
		boolean flag;
		flag = true;
		
		//here starts the application:
		System.out.println("Which type of building you want to choose?:"
				+"\nOption 1: Apartment"
				+"\nOption 2: House"
				+"\nOption 3: Office"
				+"\nOption 4: Premises");
		while(flag == true) {
			try {
				choise = input.nextInt();
				switch(choise) {
				case 1:
					System.out.println("Do you want a unique room apartment? (y/n)");
					while(flag == true) {
						try {
							choise2 = input.next();
							if (choise2.equalsIgnoreCase("y")) {
								System.out.println("You chose an Apartment with a unique room.");
								flag = false;
								choise3= true;
							} else if (choise2.equalsIgnoreCase("n")){
								System.out.println("You chose an Apartment with two or more rooms.");
								flag = false;
								choise3= false;
							} else {
								throw new InvalidOptionException();
								//System.out.println("Invalid option, try again.");
							}
						} catch(InvalidOptionException e) {
							System.out.println(e.getMessage());
						}
					}
					break;
				case 2:
					System.out.println("Do you want to have houseyard too? (y/n)");
					while(flag == true) {
						try {
							choise2 = input.next();
							if (choise2.equalsIgnoreCase("y")) {
								System.out.println("You chose an house with houseyard.");
								flag = false;
								choise3= true;
							} else if (choise2.equalsIgnoreCase("n")){
								System.out.println("You chose an house without houseyard.");
								flag = false;
								choise3= false;
							} else {
								throw new InvalidOptionException();
								//System.out.println("Invalid option, try again.");
							}
						} catch(InvalidOptionException e) {
							System.out.println(e.getMessage());
						}
					}
					break;
				case 3:
					System.out.println("Do you want a multi-office room? (y/n)");
					while(flag == true) {
						try {
							choise2 = input.next();
							if (choise2.equalsIgnoreCase("y")) {
								System.out.println("You chose a multi-office room.");
								flag = false;
								choise3= true;
							} else if (choise2.equalsIgnoreCase("n")){
								System.out.println("You a only office.");
								flag = false;
								choise3= false;
							} else {
								throw new InvalidOptionException();
								//System.out.println("Invalid option, try again.");
							}
						} catch(InvalidOptionException e) {
							System.out.println(e.getMessage());
						}
					}
					break;
					
				case 4:
					System.out.print("Do you want an industries premises? (y/n)");
					while(flag == true) {
						try {
							choise2 = input.next();
							if (choise2.equalsIgnoreCase("y")) {
								System.out.println("You chose an industries premises.");
								flag = false;
								choise3= true;
							} else if (choise2.equalsIgnoreCase("n")) {
								System.out.println("You chose an non industries premises.");
								flag = false;
								choise3= false;
							} else {
								throw new InvalidOptionException();
								//System.out.println("Invalid option, try again.");
							}
						} catch(InvalidOptionException e) {
							System.out.println(e.getMessage());
						}
					}
					break;
					
				default:
					throw new InvalidOptionException();
					//System.out.println("Invalid option, try again.");
				}
			} catch(InvalidOptionException e) {
				 System.out.println(e.getMessage());
			}
			
		}
		
		LinkedList<Building> propertiesAvailable = new LinkedList<Building>();
		System.out.println("Enter your salary in AR$: ");
		cust1.setSalary(input.nextInt());
		
		for (int i=0; i<properties; i++) {
			if (cust1.getSalary() * 0.5 >= arrBuilding[i].getRentPrice() && arrBuilding[i].getHasCaracteristic()==choise3) {
				propertiesAvailable.add(arrBuilding[i]);
			}
		}
		
		if (propertiesAvailable.size()<1) {
			throw new NullBuildingException();
		}
		
		System.out.println("The available properties for you are: ");
		
		for (int i=0; i<propertiesAvailable.size(); i++) {
			System.out.println("Adress: "+propertiesAvailable.get(i).getAdress()+" Price per month: AR$ "+propertiesAvailable.get(i).getRentPrice());
		}
	}

}
