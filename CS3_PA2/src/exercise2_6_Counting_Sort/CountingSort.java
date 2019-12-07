package exercise2_6_Counting_Sort;

import Main.SortingAlgorithm;

public class CountingSort extends SortingAlgorithm {

	public static int maxElement(int[] array) {

		int max = array[0];

		for(int i = 1; i < array.length; i++) {

			if(array[i] > max) {

				max = array[i];

			}

		}

		return max;

	}

	public static int[] booleanSort(int[] array) {

		int[] res = new int[array.length];

		String func = "Boolean";

		System.out.print(sortIntro(func, array));

		boolean[] flag = new boolean [maxElement(array)+1];

		for(int i = 0; i < array.length; i++)
			flag[array[i]] = true;

		int j = 0;

		for(int i = 0; i < flag.length; i++)
			if(flag[i] == true)
				res[j++] = i;

		return res;

	}

	public static int[] countingSort(int[] array) {

		int[] res = new int[array.length];

		String func = "Counting";

		System.out.print(sortIntro(func, array));

		int[] flag = new int [maxElement(array)+1];

		for(int i = 0; i < array.length; i++)
			flag[array[i]] += 1;

		int c = 0;

		for(int i = 0; i < flag.length; i++)
			if(flag[i] > 0)
				for(int j = i; j < flag[i]+i; j++)
					res[c++] = i;

		return res;
	}

	public static void main(String[] args) {

		String booleanSort = "Boolean";
		String countingSort = "Counting";

		int[] exampleArray1 = {11, 5, 14, 10, 2};

		System.out.print(sortOutro(booleanSort, booleanSort(exampleArray1)));
		System.out.print(sortOutro(countingSort, countingSort(exampleArray1)));

		int[] exampleArray2 = {6, 4, 5};

		System.out.print(sortOutro(booleanSort, booleanSort(exampleArray2)));
		System.out.print(sortOutro(countingSort, countingSort(exampleArray2)));

		int[] exampleArray3 = {2, 6, 8, 1, 7, 9, 4, 3, 5};

		System.out.print(sortOutro(booleanSort, booleanSort(exampleArray3)));
		System.out.print(sortOutro(countingSort, countingSort(exampleArray3)));

		int[] exampleArray4 = {4, 3, 8, 2};

		System.out.print(sortOutro(booleanSort, booleanSort(exampleArray4)));
		System.out.print(sortOutro(countingSort, countingSort(exampleArray4)));

		int[] exampleArray5 = {9,8,7,3,2,5,1,2,4,3,0};

		System.out.print(sortOutro(booleanSort, booleanSort(exampleArray5)));
		System.out.print(sortOutro(countingSort, countingSort(exampleArray5)));

		int[] exampleArray6 = {10,11,3,2,5,8,1};

		System.out.print(sortOutro(booleanSort, booleanSort(exampleArray6)));
		System.out.print(sortOutro(countingSort, countingSort(exampleArray6)));

	}

}
