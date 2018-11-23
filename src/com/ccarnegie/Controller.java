package com.ccarnegie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class Controller {
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	Controller() {
		Sorter sorter = new Sorter();
		Random rng = new Random();
		
		boolean loop;
		int userChoice, arraySize, minNumber, maxNumber;
		int[] unsortedArray;
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
			unsortedArray = rng.ints(arraySize, minNumber, maxNumber).toArray();
			
			/* ----- Algorithm Choice ----- */
			System.out.println("Which of the algorithms would you like to use?");
			System.out.println("1: Insertion Sort");
			System.out.println("2: Selection Sort");
			System.out.println("0: Exit");
			
			userChoice = getInteger(1, 2);
			switch (userChoice) {
				case 0:
					loop = false;
				case 1:
					break;
				case 2:
					break;
			}
			
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

