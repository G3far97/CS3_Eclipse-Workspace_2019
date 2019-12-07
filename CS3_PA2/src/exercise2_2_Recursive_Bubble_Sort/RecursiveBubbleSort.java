package exercise2_2_Recursive_Bubble_Sort;

import Main.SortingAlgorithm;

public class RecursiveBubbleSort extends SortingAlgorithm{

	public static void bubbleSortRecHelper(int[] array, int c) {
		
		if(c == array.length-1)
			return;
		
		for(int j = 0; j < array.length-1-c; j++) {

			if(array[j] > array[j+1]) {

				int temp = array[j+1];
				array[j+1] = array[j];
				array[j] = temp;

			}
		}
		
		bubbleSortRecHelper(array, c+1);

	}

	public static void bubbleSortRec(int[] array) {

		String func = "Recursive Bubble";

		System.out.print(sortIntro(func, array));

		bubbleSortRecHelper(array, 0);

		System.out.print(sortOutro(func, array));

	}

	public static void main(String[] args) {

		int[] exampleArray = {11, 5, 14, 10, 2};

		bubbleSortRec(exampleArray);


	}

}
