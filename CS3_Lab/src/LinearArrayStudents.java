public class LinearArrayStudents {

	int[] array;
	int itemCount;

	public LinearArrayStudents(int s) {

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

	public static void main (String[]args) {

		System.out.println("Done!");

	}

}
