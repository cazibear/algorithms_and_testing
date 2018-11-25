package com.ccarnegie;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
	private Random rng = new Random();
	private Sorter sorter = new Sorter();
	
	@Test
	void bubbleSort() {
		int[] sortedArray, assertion;
		
		
		sortedArray = rng.ints(100, -100, 100).toArray();
		assertion = sortedArray.clone();
		
		sorter.bubbleSort(sortedArray);
		Arrays.sort(assertion);
		
		assertArrayEquals(sortedArray, assertion);
	
	}
}
