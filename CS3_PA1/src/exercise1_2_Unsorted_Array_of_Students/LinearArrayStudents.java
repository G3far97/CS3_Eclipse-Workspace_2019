package exercise1_2_Unsorted_Array_of_Students;

public class LinearArrayStudents {

	Student [] sArray;
	int sCount;

	public LinearArrayStudents(int s) {

		this.sArray = new Student [s];

	}

	public void insert(Student x)
	{
		if (sCount < sArray.length)
		{
			for(int i = 0; i <sArray.length; i++)
				if(sArray[i]==null)
				{
					sArray[i] = x;
					break;
				}
			sCount++;
		}
		else
			System.out.print("Array is Full");
	}

	public void insertLast(Student x) {

		this.sArray[this.sCount] = x;
		this.sCount++;

	}

	public void insertFirst(Student x) {

		for(int i = this.sCount-1; i>=0;i--) {

			this.sArray[i+1] = this.sArray[i];

		}

		this.sArray[0] = x;
		this.sCount++;

	}

	public int linearSearch(Student x) {

		for(int i = 0; i < sArray.length; i++)
			
			if(sArray[i]!= null && sArray[i].ID == x.ID)//order is crucial and must use && not just &
			
				return i;
		
			return -1;

	}

	public void delete(Student x) {

		int pos = this.linearSearch(x);

		if(pos != -1) {

			this.sArray[pos] = null;

			this.sCount--;

		}
		else {

			System.out.println("Sorry! Item not found");

		}

	}

	public void displaySarray() {

		System.out.println("Array: ");
		
		for(int i = 0; i < this.sCount; i++) {

			if(sArray[i] != null)
				
				System.out.println(sArray[i]);

			System.out.println();
		
		}

	}

	public static void main (String[]args) {

		LinearArrayStudents a = new LinearArrayStudents(10);
		a.insert(new Student("Timmy", "Turner", 1));
		a.insert(new Student("Harry", "Potter", 2));
		a.insert(new Student("Peter", "Parker", 3));
		a.insertLast(new Student("Jack", "Sparrow", 4));
		a.displaySarray();
		System.out.println("Count: " + a.sCount);
		System.out.println("Position of Harry: " + a.linearSearch(new Student("Harry", "Potter", 2)));
		a.delete(new Student("Hermione", "Granger", 5));
		a.delete(new Student("Harry", "Potter", 2));
		System.out.println("Count: " + a.sCount);
		a.displaySarray();
		System.out.println("Position of Harry: " + a.linearSearch(new Student("Harry", "Potter", 2)));

	}

}
