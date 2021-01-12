package lab_assignment_2;

import java.util.Scanner;

public class StudentApplication {
	public static void main(String[] args) {
		
		Student s1 = null;
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("-----------------MENU----------------");
			System.out.println("1. Create Student");
			System.out.println("2. Display Student Details");
			System.out.println("0. Exit");

			System.out.print("Enter your choice:  ");
			int ch = input.nextInt();
			input.nextLine();

			if (ch == 1) {

				System.out.println("Enter Id: ");
				String stuId = input.nextLine();
				String stuName = "";
				double stuGrade = 0.0;
				boolean nameFlag = false, gradeFlag = false;

				System.out.println("Do you want to enter name?: ");
				String nameChoice = input.nextLine();

				if (nameChoice.equals("y")) {
					System.out.println("Enter Name: ");
					stuName = input.nextLine();
					nameFlag = true;
				}

				System.out.println("Do you want to enter grade?: ");
				String gradeChoice = input.nextLine();

				if (gradeChoice.equals("y")) {
					System.out.println("Enter grade: ");
					stuGrade = input.nextDouble();
					input.nextLine();
					gradeFlag = true;
				}

				if (nameFlag && gradeFlag) {
					s1 = new Student(stuId, stuName, stuGrade);
				}

				else if (nameFlag) {
					s1 = new Student(stuId, stuName);
				}

				else {
					s1 = new Student(stuId);
				}

			}

			else if (ch == 2) {
				
				if(s1==null) {
					System.out.println("There is no student");
					break;
				}
				
				System.out.println("Do you want to enter your current year?: ");
				String yearChoice = input.nextLine();

				if (yearChoice.equals("y")) {
					
					System.out.println("Enter Year: ");
					int curYear = input.nextInt();

					s1.display(curYear);
				}
				
				else {
					s1.display();
				}

			}

			else if (ch == 0) {
				System.out.println("Exiting the system...");
				input.close();
			}
		}

	}
}
