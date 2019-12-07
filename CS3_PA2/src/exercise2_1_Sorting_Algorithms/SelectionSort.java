package exercise2_1_Sorting_Algorithms;

import Main.SortingAlgorithm;

public class SelectionSort extends SortingAlgorithm {

	public static void selectionSort(int[] array) {
		
		String func = "Selection";

		System.out.print(sortIntro(func, array));

		for(int i = 0; i < array.length-1; i++) {

			int smallestSoFarPos = i;

			for(int j = i+1; j < array.length; j++) {

				if(array[j] < array[smallestSoFarPos]) {

					int temp = array[j];
					array[j] = array[smallestSoFarPos];
					array[smallestSoFarPos] = temp;

				}

			}

		}

		System.out.print(sortOutro(func, array));

	}

	public static void main(String[] args) {

		int[] exampleArray = {11, 5, 14, 10, 2};

		selectionSort(exampleArray);

	}

}
