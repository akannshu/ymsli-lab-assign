package lab_assignment_2;

public class Student {

	String stuName, stuId;
	double grade;
	int curYear;

	public Student() {
	};

	public Student(String stuID, String stuName, double grade) {

		this(stuID, stuName);
		this.grade = grade;

	}

	public Student(String stuId) {

		this.stuId = stuId;
	}

	public Student(String stuId, String stuName) {

		this(stuId);
		this.stuName = stuName;
	}

	public void display() {

		System.out.println("Your Id is: " + stuId);

		if (!(stuName==null)) {
			System.out.println("Your Name is: " + stuName);
		}

		if (grade != 0.0) {
			System.out.println("Your Grade is: " + grade);
		}
	}

	public void display(int curYear) {
		this.display();
	}

}
