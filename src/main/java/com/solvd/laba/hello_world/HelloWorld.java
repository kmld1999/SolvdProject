package com.solvd.laba.hello_world;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter yor name: ");
		String name = input.next();
		System.out.println("Hello " + name);
	}
}
