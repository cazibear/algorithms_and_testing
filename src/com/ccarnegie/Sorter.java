package com.ccarnegie;

public class Sorter {
	
	public void insertionSort(int[] array) {
	
	}
	
	public void selectionSort(int[] array) {
	
	}
	
	public void mergeSort(int[] array) {
	
	}
	
	public void heapSort(int[] array) {
	
	}
	
	public void quickSort(int[] array) {
	
	}
	
	public void shellSort(int[] array) {
	
	}
	
	public void bubbleSort(int[] array) {
		boolean swap;
		int i, j, temp, comparisons = 0, swaps = 0;
		
		for (i = 0; i < array.length - 1; i++) {
			swap = false;
			for (j = 0; j < array.length - 1 - i; j++) {
				comparisons++;
				if (array[j] > array[j+1]) {
					swap = true;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swaps++;
				}
			}
			if (!swap)
				break;
		}
		
		System.out.println("C: " + comparisons + " S: " + swaps);
	}
	
	public void combSort(int[] array) {
	
	}
	
	public void countingSort(int[] array) {
	
	}
	
	public void bucketSort(int[] array) {
	
	}
	
	public void radixSort(int[] array) {
	
	}
	
	private void swap(int[] array, int indexA, int indexB) throws IndexOutOfBoundsException {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
}
