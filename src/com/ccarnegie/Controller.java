package com.ccarnegie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

class Controller {
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	Controller() {
		Integer userChoice;
		Random rng = new Random();
		Sorter sorter = new Sorter();
		
		boolean loop;
		int arraySize, minNumber, maxNumber;
		int[] sortingArray;
		String yesOrNo;
		
		do {
			loop = true;
			
			/* ----- Creating an array ----- */
			arraySize = 20;
			minNumber = 1;
			maxNumber = 100;
			
			System.out.println("Generating an array to sort, do  you want to customise?");
			System.out.println("Enter y or yes to customise.");
			yesOrNo = getString();
			if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {
				/* ----- Customising the array creation ----- */
				
				System.out.print("What size of array do you want to create: ");
				arraySize = getInteger(1, Integer.MAX_VALUE - 8);
				// the max size can vary between VMs, but this would take up to nearly 8gb
				System.out.print("What do you want the lower bound of your array to be: ");
				minNumber = getInteger(Integer.MIN_VALUE, Integer.MAX_VALUE - 1);
				System.out.print("What do you what the higher bound of your array to be: ");
				maxNumber = getInteger(minNumber + 1, Integer.MAX_VALUE -1); //
			}
			sortingArray = rng.ints(arraySize, minNumber, maxNumber).toArray();
			System.out.println("Array before sorting:");
			System.out.println(Arrays.toString(sortingArray));
			System.out.println();
			
			/* ----- Algorithm Choice ----- */
			System.out.println("Which of the algorithms would you like to use?");
			System.out.println("1: Insertion Sort");
			System.out.println("2: Selection Sort");
			System.out.println("3: Merge Sort");
			System.out.println("4: Heap Sort");
			System.out.println("5: Quick Sort");
			System.out.println("6: Shell Sort");
			System.out.println("7: Bubble Sort");
			System.out.println("8: Comb Sort");
			System.out.println("9: Counting Sort");
			System.out.println("10: Bucket Sort");
			System.out.println("11: Radix Sort");
			System.out.println("Any other numbers to exit");
			userChoice = getInteger(1, 11);
			
			/* ----- Sorting the array ----- */
			switch (userChoice) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					System.out.println("Bubble Sort -");
					sorter.bubbleSort(sortingArray);
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				default:
					loop = false;
			}
			System.out.println("Array after sorting:");
			System.out.println(Arrays.toString(sortingArray));
			System.out.println();
			
		} while (loop);
	}
	
	private int getInteger(int min, int max) {
		Integer input = null;
		
		System.out.println("Please enter a number between " + min + " and " + max + " (inclusive): ");
		while (input == null || input < min || input > max) {
			// keeps looping if an error occurs and the input does not change
			try {
				input = new Integer(in.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number between " + min + " and " + max + " (inclusive): ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return input;
	}
	
	/*
	private double getIntArray(double min, double max) {
		//TODO implement this for manually entering array
		
		return input;
	}
	*/
	
	private String getString() {
		// gets a string from the user and handles exceptions
		String input = null;
		
		while (input == null) {
			// keeps looping if an error occurs and the input does not change
			try {
				input = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return input;
	}
}

