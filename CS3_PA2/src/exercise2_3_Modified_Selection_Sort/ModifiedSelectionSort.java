package exercise2_3_Modified_Selection_Sort;

import Main.SortingAlgorithm;

public class ModifiedSelectionSort extends SortingAlgorithm {

	public static void modifiedSelectionSort(int[] array) {

		String func = "Modified Selection";

		System.out.print(sortIntro(func, array));

		for(int i = 0; i < array.length; i++) {

			int smallestSoFarPos = i;
			int largestSoFarPos = array.length-1-i;

			for(int j = i+1; j < array.length; j++) {

				if(array[j] < array[smallestSoFarPos]) {

					int temp = array[j];
					array[j] = array[smallestSoFarPos];
					array[smallestSoFarPos] = temp;

				}

				if(array[array.length-1-j] > array[largestSoFarPos]) {

					int temp = array[array.length-1-j];
					array[array.length-1-j] = array[largestSoFarPos];
					array[largestSoFarPos] = temp;

				}

			}

		}

		System.out.print(sortOutro(func, array));

	}

	public static void main(String[] args) {

		int[] exampleArray1 = {11, 5, 14, 10, 2};

		modifiedSelectionSort(exampleArray1);

		int[] exampleArray2 = {6, 4, 5};

		modifiedSelectionSort(exampleArray2);

		int[] exampleArray3 = {2, 6, 8, 1, 7, 9, 4, 3, 5};

		modifiedSelectionSort(exampleArray3);

	}

}
