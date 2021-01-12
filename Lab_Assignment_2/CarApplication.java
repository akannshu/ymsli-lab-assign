package lab_assignment_2;

import java.util.Scanner;

public class CarApplication {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------MENU----------------");
			System.out.println("1. Create Vehicle");
			System.out.println("2. Create Car");
			System.out.println("3. Create Convertible");
			System.out.println("4. Create SportsCar");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			int choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				Vehicle v1 = new Vehicle();
				v1.display();
			}

			else if (choice == 2) {

				Car c1 = new Car();
				c1.display();
			}

			else if (choice == 3) {

				Convertible cv1 = new Convertible();
				cv1.display();
			}

			else if (choice == 4) {

				SportsCar sc1 = new SportsCar();
				sc1.display();
			}

			else if (choice == 0) {
				input.close();
				break;
				
			}

		}
	}
}
