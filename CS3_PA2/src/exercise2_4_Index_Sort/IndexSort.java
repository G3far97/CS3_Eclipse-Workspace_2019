package exercise2_4_Index_Sort;

import Main.SortingAlgorithm;

public class IndexSort extends SortingAlgorithm {

	public static int[] indexSort(int[] array) {

		int[] res = new int[array.length];

		String func = "Index";

		System.out.print(sortIntro(func, array));

		for(int i = 0; i < array.length; i++) {

			int index = 0;

			for(int j = 0; j < array.length; j++ )
				if(array[j] < array[i] || ((array[j] == array[i]) && (j < i)))
					index++;

			res[index] = array[i];

		}

		return res;

	}

	public static void main(String[] args) {
		
		String funcName = "Index";

		int[] exampleArray1 = {11, 5, 14, 10, 2};

		System.out.print(sortOutro(funcName, indexSort(exampleArray1)));

		int[] exampleArray2 = {6, 4, 5};

		System.out.print(sortOutro(funcName, indexSort(exampleArray2)));

		int[] exampleArray3 = {2, 6, 8, 1, 7, 9, 4, 3, 5};

		System.out.print(sortOutro(funcName, indexSort(exampleArray3)));

		int[] exampleArray4 = {4, 3, 8, 2};

		System.out.print(sortOutro(funcName, indexSort(exampleArray4)));
		
		int[] exampleArray5 = {9,8,7,3,2,5,1,2,4,3,0};
		
		System.out.print(sortOutro(funcName, indexSort(exampleArray5)));

	}

}
