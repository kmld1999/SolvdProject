package com.solvd.laba.sorting;

public class LettersSorting {
	private char[] letterSort(String word) {
		char arrWord[] = word.toCharArray();
		char temp;
		for (int i = 0; i < arrWord.length; i++) {
			for (int j = i + 1; j < arrWord.length; j++) {
				if (arrWord[j] < arrWord[i]) {
					temp = arrWord[i];
					arrWord[i] = arrWord[j];
					arrWord[j] = temp;
				}
			}
		}
		return arrWord;
	}
	public void setLetterSort(String word) {
		this.letterSort(word);
	}
	public char[] getLetterSort(String word) {
		return letterSort(word);
	}
}