package com.solvd.laba.sorting;

class NumberSorting {
	private int partition(int arr[], int left, int right) {
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

	private int[] quickSort(int arr[], int left, int right) {
		if (left < right) {
			int pos = partition(arr, left, right);
			quickSort(arr, left, pos - 1);
			quickSort(arr, pos + 1, right);
		}
		return arr;
	}
	
	
	public void setQuickSort(int arr[], int left, int right) {
		this.quickSort(arr, left, right);
	}
	
	public int[] getQuickSort(int arr[], int left, int right) {
		return quickSort(arr, left, right);
	}
	
}


