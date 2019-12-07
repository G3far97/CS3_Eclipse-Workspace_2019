package exercise2_7_Student_Records;

public class Student {

	String name;
	int ID;
	double GPA;

	public Student(String name, int id, double gpa) {

		this.name = name;
		this.ID = id;
		this.GPA = gpa;

	}

	public String toString() {

		return name+", ID: "+ID+", GPA: "+GPA+"\n";

	}

	public static void studentSwap(Student[] s, int i) {

		Student temp = s[i];
		s[i] = s[i+1];
		s[i+1] = temp;

	}

	public static void sortByID(Student[] s) {

		for(int i = 0; i < s.length-1; i++) {

			for(int j = 0; j < s.length-1-i; j++) {

				if(s[j] == null || s[j+1] == null)
					break;

				else if ( (s[j].ID) > (s[j+1].ID))
					studentSwap(s, j);

			}

		}

	}
	
	public static void sortByGPA(Student[] s) {

		for(int i = 0; i < s.length-1; i++) {

			for(int j = 0; j < s.length-1-i; j++) {

				if(s[j] == null || s[j+1] == null)
					break;

				else if ( (s[j].GPA) > (s[j+1].GPA))
					studentSwap(s, j);

			}

		}

	}

	public static void sortByName(Student[] s) {

		for(int i = 0; i < s.length-1; i++) {

			for(int j = 0; j < s.length-1-i; j++) {

				if(s[j] == null || s[j+1] == null)
					break;

				else if ( (s[j].name.charAt(0)) > (s[j+1].name.charAt(0)))
					studentSwap(s, j);

			}

		}

	}

	public static void main(String[] args) {

		Student[] records = new Student[3];
		records[0] = new Student("Mohamed",9181, 2.1);
		records[1] = new Student("Amira", 2241, 1.2);
		records[2] = new Student("Yasmine",1902,0.9);
		
		System.out.println("Original data:"+"\n"+" ");
		for(int i = 0; i< records.length; i++)
			System.out.println(records[i].toString());
		System.out.println("-------------------------------------------------");
		
		sortByName(records);
		System.out.println("After sorting by Name:"+"\n"+" ");
		for(int i = 0; i< records.length; i++)
			System.out.println(records[i].toString());
		System.out.println("-------------------------------------------------");
		
		sortByID(records);
		System.out.println("After sorting by ID:"+"\n"+" ");
		for(int i = 0; i< records.length; i++)
			System.out.println(records[i].toString());
		System.out.println("-------------------------------------------------");
		
		sortByGPA(records);
		System.out.println("After sorting by GPA:"+"\n"+" ");
		for(int i = 0; i< records.length; i++)
			System.out.println(records[i].toString());
		System.out.println("-------------------------------------------------");

	}

}
