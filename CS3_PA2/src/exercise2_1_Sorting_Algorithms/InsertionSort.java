package exercise2_1_Sorting_Algorithms;

import Main.SortingAlgorithm;

public class InsertionSort extends SortingAlgorithm{

	public static void insertionSort(int[] array) {
		
		String func = "Insertion";

		System.out.print(sortIntro(func, array));
		
		for(int i = 1; i < array.length; i++) {

			int temp = array[i];
				
				int j;
				
				for(j = i-1; j >= 0 && temp < array[j]; j--) {
					
					array[j+1] = array[j];
					
				}
				
				array[j+1] = temp;

		}
		
		System.out.print(sortOutro(func, array));
		
	}

	public static void main(String[] args) {

		int[] exampleArray = {11, 5, 14, 10, 2};

		insertionSort(exampleArray);

	}

}
