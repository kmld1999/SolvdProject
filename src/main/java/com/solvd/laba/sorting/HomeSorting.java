package com.solvd.laba.sorting;

import java.util.Scanner;

public class HomeSorting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while (flag == true) {
			System.out.print("What do you want to sort? type n for numbers or w for a word/letters: ");
			String choise = input.next();
			
			if (choise.equalsIgnoreCase("n")) {
				System.out.print("Enter the number of elements: ");
				int elements = input.nextInt();
				System.out.println("Enter the elements: ");
				int[] arr = new int[elements];
				for (int i = 0; i < elements; i++) {
					int j = input.nextInt();
					arr[i] = j;}
				
				while (flag == true) {
					System.out.print("Type a for ascending sorting or d for descending sorting: ");
					String choise2 = input.next();
					
					if (choise2.equalsIgnoreCase("a")) {
						NumberSorting newArr = new NumberSorting();
						newArr.setQuickSort(arr, 0, elements -1);
						newArr.getQuickSort(arr, 0, elements -1);
						for (int i = 0; i < elements; i++) {
						System.out.print(arr[i] + " ");
						}
						flag = false;
						
					} else if (choise2.equalsIgnoreCase("d")) {
						BackwardNumberSorting newArr = new BackwardNumberSorting();
						newArr.setQuickSort(arr, 0, elements -1);
						newArr.getQuickSort(arr, 0, elements -1);
						for (int i = 0; i < elements; i++) {
						System.out.print(arr[i] + " ");
						
						flag = false;
						}
					} else {
						System.out.print("Incorrect value, try again. ");
					}
				}
				
			} else if (choise.equalsIgnoreCase("w")){
				System.out.print("Enter the word: ");
				String word = input.next();
				
				while (flag == true) {
					System.out.print("Type a for ascending sorting or d for descending sorting: ");
					String choise2 = input.next();
					
					if (choise2.equalsIgnoreCase("a")) {
						LettersSorting newArr = new LettersSorting();
						newArr.setLetterSort(word);
						System.out.println(newArr.getLetterSort(word));
						flag = false;
						
					} else if (choise2.equalsIgnoreCase("d")) {
						BackwardLettersSorting newArr = new BackwardLettersSorting();
						newArr.setBackwardLetterSort(word);
						System.out.println(newArr.getBackwardLetterSort(word));
						flag = false;
						
					} else {
						System.out.print("Incorrect value, try again. ");
					}
				}
				
			} else {
				System.out.print("Incorrect value, try again. ");
			}
			
		}
	}
}
