package com.solvd.laba.hello_world;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int elements = input.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[elements];
		for (int i = 0; i < elements; i++) {
			int j = input.nextInt();
			arr[i] = j;
		}
		quickSort(arr, 0, elements - 1);
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int partition(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = (left - 1);
		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;

		return i + 1;
	}

	static void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int pos = partition(arr, left, right);
			quickSort(arr, left, pos - 1);
			quickSort(arr, pos + 1, right);
		}
	}
}
