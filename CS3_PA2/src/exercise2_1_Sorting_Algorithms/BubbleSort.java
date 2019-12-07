package exercise2_1_Sorting_Algorithms;

import Main.SortingAlgorithm;

public class BubbleSort extends SortingAlgorithm{

	public static void bubbleSort(int[] array){
		
		String func = "Bubble";

		System.out.print(sortIntro(func, array));

		for(int i = 0; i < array.length-1; i++) {

			for(int j = 0; j < array.length-1-i; j++) {

				if(array[j] > array[j+1]) {

					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;

				}

			}

		}
		
		System.out.print(sortOutro(func, array));

	}

	public static void main(String[] args) {

		int[] exampleArray = {11, 5, 14, 10, 2};

		bubbleSort(exampleArray);

	}

}
