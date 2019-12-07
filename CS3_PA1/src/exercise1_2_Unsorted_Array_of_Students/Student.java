package exercise1_2_Unsorted_Array_of_Students;

public class Student {

	String firstName, lastName;
	int ID;
	
	public Student(String first, String last, int id) {
		
		this.firstName = first;
		this.lastName = last;
		this.ID = id;
		
	}
	
	public String toString() {
		
		return firstName+" "+lastName+", ID: "+ID;
	
	}
	
}
