package com.solvd.laba.sorting;

public class BackwardLettersSorting {
	private char[] backwardLetterSort(String word) {
		char arrWord[] = word.toCharArray();
		char temp;
		for (int i = 0; i < arrWord.length; i++) {
			for (int j = i + 1; j < arrWord.length; j++) {
				if (arrWord[j] > arrWord[i]) {
					temp = arrWord[i];
					arrWord[i] = arrWord[j];
					arrWord[j] = temp;
				}
			}
		}
		return arrWord;
	}
	public void setBackwardLetterSort(String word) {
		this.backwardLetterSort(word);
	}
	public char[] getBackwardLetterSort(String word) {
		return backwardLetterSort(word);
	}
}