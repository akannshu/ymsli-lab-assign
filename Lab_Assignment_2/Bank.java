package lab_assignment_2;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		System.out.println("--------BANK------");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String username = input.nextLine();

		System.out.println("-----------------MENU----------------");
		System.out.println("1. Current Account");
		System.out.println("2. Savings Account");
		System.out.println("0. Exit");

		System.out.print("Which type of Account you want to open: ");
		int choice = input.nextInt();
		input.nextLine();

		if (choice == 1) {

			CurrentAccount crAcc = new CurrentAccount(username);

			while (true) {
				System.out.print("What do you want to do?: ");
				int ch = input.nextInt();
				input.nextLine();

				if (ch == 3) {
					System.out.println("Your Balance is: " + crAcc.getBalance());
				}

				else if (ch == 2) {
					System.out.print("How much amount you want to withdraw: ");
					double amount = input.nextDouble();
					input.nextLine();

					crAcc.withdraw(amount);
				}

				else if (ch == 1) {
					System.out.print("How much amount you want to deposit: ");
					double amount = input.nextDouble();
					input.nextLine();

					crAcc.deposit(amount);
				}

				else if (ch == 0) {
					System.out.println("Exiting the system...");
					break;
				}
			}
		}

		else if (choice == 2) {

			SavingsAccount svAcc = new SavingsAccount(username);

			while (true) {
				System.out.print("What do you want to do?: ");
				int ch = input.nextInt();
				input.nextLine();

				if (ch == 1) {
					System.out.println("Your Balance is: " + svAcc.getBalance());
				}

				else if (ch == 2) {
					System.out.print("How much amount you want to withdraw: ");
					double amount = input.nextDouble();
					input.nextLine();

					svAcc.withdraw(amount);
				}

				else if (ch == 1) {
					System.out.print("How much amount you want to deposit: ");
					double amount = input.nextDouble();
					input.nextLine();

					svAcc.deposit(amount);
				}

				else if (ch == 0) {
					System.out.println("Exiting the system...");
					break;
				}
			}
		}

		else if (choice == 0) {
			System.out.println("Exiting the system...");
			input.close();
		}

	}
}
