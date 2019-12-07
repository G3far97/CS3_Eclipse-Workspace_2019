package exercise1_3_Sorted_Array;

public class LinearSortedArray {

	int[] array;
	int itemCount;

	public LinearSortedArray(int maxSize) {

		this.array = new int [maxSize];

	}

	public void orderedInsert(int x) {

		int insertionPos = 0;

		if(itemCount < array.length) {

			while(insertionPos < itemCount && array[insertionPos] < x) {

				insertionPos++;

			}

			for(int i = itemCount; i > insertionPos; i--) {

				array[i] = array[i-1];

			}

			array[insertionPos] = x;

			itemCount++;

		}
		else {

			System.out.println("Sorry! can't insert "+x+", The Array is Full !!");

		}



	}

	public void orderedInsertAlt(int x) {

		if(itemCount < array.length) {

			int i;

			for( i = itemCount; i > 0 && array[i-1] > x; i--) {

				array[i] = array[i-1];

			}

			array[i] = x;

			itemCount++;

		}
		else {

			System.out.println("Sorry! can't insert "+x+", The Array is Full !!");

		}

	}

	public void orderedInsertRec(int x) {

		if(itemCount < array.length) {

			orderedInsertRecHelper(x, itemCount);

		}
		else {

			System.out.println("Sorry! can't insert "+x+", The Array is Full !!");

		}

	}

	public void orderedInsertRecHelper(int x, int c) {

		if(itemCount < array.length) {

			if(c > 0 && x < array[c - 1]) {

				array[c] = array[c-1];

				orderedInsertRecHelper(x, c-1);
			}

			else {

				array[c] = x;

				itemCount++;

				return;

			}

		}
		else {

			System.out.println("Sorry! can't insert "+x+", The Array is Full !!");

		}

	}

	public int binarySearchIter(int x) {

		int lowerPound = 0;
		int upperPound = itemCount - 1;
		int pos;

		while(lowerPound <= upperPound) {

			pos = lowerPound + (upperPound -lowerPound)/2;

			if(array[pos] == x) {

				return pos;

			}
			else if(x > array[pos]){

				lowerPound = pos + 1;

			}
			else {

				upperPound = pos - 1;

			}

		}

		return -1;

	}

	public int binarySearchRec(int x) {

		return binarySearchRecHelper(0, itemCount-1, x);

	}

	public int binarySearchRecHelper(int lowerPound, int upperPound, int x) {

		int pos = lowerPound + (upperPound - lowerPound)/2;

		if(lowerPound > upperPound) {

			return -1;

		}
		else if(array[pos] == x){

			return pos;

		}
		else if(x < array[pos]){

			return binarySearchRecHelper(lowerPound, pos-1, x);

		}
		else {

			return binarySearchRecHelper(pos+1, upperPound, x);

		}

	}

	public void delete(int x) {

		if(this.binarySearchRec(x) != -1) {

			for(int i = this.binarySearchRec(x);i < this.itemCount-1;i++) {

				this.array[i] = this.array[i+1];

			}

			this.itemCount--;

		}
		else {

			System.out.println("Sorry! "+x+" not found");

		}

	}

	public void displayArray() {

		System.out.print("Sorted Array: ");
		
		for(int i = 0; i < itemCount; i++)
		{
			
			System.out.print(array[i] + " ");
		
		}
		
		System.out.println();

	}

	public static void main(String[] args) {

		LinearSortedArray b = new LinearSortedArray(10);
		
		b.orderedInsert(5);
		b.orderedInsert(3);
		b.orderedInsert(1);
		b.orderedInsert(44);
		b.displayArray();
		
		System.out.println("Iteratively 5 at: " + b.binarySearchIter(5));
		System.out.println("Recursively 6 at: " + b.binarySearchRec(6));
		System.out.println("Recursively 5 at: " + b.binarySearchRec(5));

	}

}
