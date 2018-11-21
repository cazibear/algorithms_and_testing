package com.ccarnegie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Controller {
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	Controller() {
		Sorter sorter = new Sorter();
		
		boolean loop;
		int userChoice;
		String userArray;
		
		do {
			loop = true;
			System.out.println("Enter an array of integers:");
			
			
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
}

