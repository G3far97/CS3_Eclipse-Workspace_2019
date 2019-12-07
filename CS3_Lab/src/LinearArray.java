public class LinearArray {
	
	int[] array;
	int itemCount;
	
	public LinearArray(int s) {
		
		this.array = new int [s];
		
	}
	
	public void insertLast(int x) {
		
		this.array[this.itemCount] = x;
		this.itemCount++;
	
	}
	
	public void insertFirst(int x) {
		
		for(int i = this.itemCount-1; i>=0;i--) {
			
			this.array[i+1] = this.array[i];
			
		}
		
		this.array[0] = x;
		this.itemCount++;
		
	}
	
	public int linearSearch(int x) {
		
		for(int i = 0;i<this.itemCount;i++) {
			
			if(this.array[i] == x) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public void delete(int x) {
		
		if(this.linearSearch(x) != -1) {
			
			for(int i = this.linearSearch(x);i < this.itemCount-1;i++) {
				
				this.array[i] = this.array[i+1];
				
			}
			this.itemCount--;
			
		}
		else {
			
			System.out.print("Sorry! Item not found");
			
		}
		
	}
	
	public void displayArray() {
		
		// print the array
		System.out.print("Array: ");
		for(int i = 0; i < itemCount; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		
	}

	
	public static void main (String[]args) {
		
		LinearArray a = new LinearArray(10);
		a.insertLast(3);
		a.insertLast(7);
		a.insertFirst(8);
		a.displayArray();
		System.out.println("Count: " + a.itemCount);
		System.out.println("Position of 8: " + a.linearSearch(8));
		System.out.println("Position of 5: " + a.linearSearch(5));
		a.delete(33);
		a.delete(3);
		System.out.println("Count: " + a.itemCount);

		
	}
	
}
