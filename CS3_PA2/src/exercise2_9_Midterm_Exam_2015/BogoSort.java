package exercise2_9_Midterm_Exam_2015;

import java.util.Random;

import Main.SortingAlgorithm;

public class BogoSort extends SortingAlgorithm {

	public static void bogoSort(int[] array) {

		String func = "Bogo";

		System.out.print(sortIntro(func, array));
		
		while(!isSorted(array)) {
			
			shuffle(array);
						
		}

		System.out.print(sortOutro(func, array));

	}
	
	public static void shuffle(int[] array) {
	
			Random rgen = new Random();  // Random number generator			
	 
			for (int i=0; i<array.length; i++) {
			    int randomPosition = rgen.nextInt(array.length);
			    int temp = array[i];
			    array[i] = array[randomPosition];
			    array[randomPosition] = temp;
			}
		
	}
	
	public static boolean isSorted(int[] array) {
		
		for(int i = 0; i < array.length-1; i++)
			if(array[i+1] < array[i])
				return false;
		
		return true;
		
	}

	public static void main(String[] args) {

		int[] exampleArray1 = {11, 5, 14, 10, 2};

		bogoSort(exampleArray1);

		int[] exampleArray2 = {6, 4, 5};

		bogoSort(exampleArray2);

		int[] exampleArray3 = {2, 6, 8, 1, 7, 9, 4, 3, 5};

		bogoSort(exampleArray3);

		int[] exampleArray4 = {4, 3, 8, 2};

		bogoSort(exampleArray4);

		int[] exampleArray5 = {9, 8, 7, 3, 2, 5, 1, 2, 4, 3, 0};

		bogoSort(exampleArray5);

		int[] exampleArray6 = {10, 11, 3, 2, 5, 8, 1};

		bogoSort(exampleArray6);
		
		int[] exampleArray7 = {4, 7, 1, 9, 3};
		
		bogoSort(exampleArray7);

	}

}
