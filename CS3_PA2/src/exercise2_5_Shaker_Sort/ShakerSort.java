package exercise2_5_Shaker_Sort;

import Main.SortingAlgorithm;

public class ShakerSort extends SortingAlgorithm {

	public static void shakerSort(int[] array){

		String func = "Shaker";

		System.out.print(sortIntro(func, array));

		for(int i = 0; i < (array.length)/2; i++) {

			for(int j = 0; j < array.length-1-i; j++) {

				if(array[j] > array[j+1]) {

					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;

				}

			}

			for(int j = array.length-1-i; j > 0; j--) {

				if(array[j] < array[j-1]) {

					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;

				}

			}

		}

		System.out.print(sortOutro(func, array));

	}

	public static void main(String[] args) {

		int[] exampleArray1 = {11, 5, 14, 10, 2};

		shakerSort(exampleArray1);

		int[] exampleArray2 = {6, 4, 5};

		shakerSort(exampleArray2);

		int[] exampleArray3 = {2, 6, 8, 1, 7, 9, 4, 3, 5};

		shakerSort(exampleArray3);

		int[] exampleArray4 = {4, 3, 8, 2};

		shakerSort(exampleArray4);

		int[] exampleArray5 = {9,8,7,3,2,5,1,2,4,3,0};

		shakerSort(exampleArray5);

		int[] exampleArray6 = {10,11,3,2,5,8,1};

		shakerSort(exampleArray6);

	}

}
