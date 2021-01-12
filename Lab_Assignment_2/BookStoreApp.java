package lab_assignment_2;

import java.util.Scanner;

class BookStoreApp {
	public static void main(String[] args) {
		BookStore myBookStore = new BookStore();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------MENU----------------");
			System.out.println("1. Display Books");
			System.out.println("2. Order Books");
			System.out.println("3. Sell Books");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = input.nextInt();
			input.nextLine();
			
			if(choice==1) {
				myBookStore.display();
			}
			
			else if(choice==2) {
				while(true) {
					
					System.out.print("Enter ISBN of the Book: ");
					String ISBN = input.nextLine();
				
					System.out.print("Enter the Number of the Copies you want to order: ");
					int numberOfCopies = input.nextInt();
					input.nextLine();
					myBookStore.order(ISBN, numberOfCopies);
					
					System.out.println("Do you want to order more books?(Press 0 to exit; 1 to continue):");
					int reply = input.nextInt();
					input.nextLine();
					if(reply == 0) {
						break;
					}
				}
			}
			
			else if(choice==3) {
				
				while(true) {
				
					System.out.print("Enter ISBN of the Book: ");
					String ISBN = input.nextLine();
				
					System.out.print("Enter the Number of the Copies you want to order: ");
					int numberOfCopies = input.nextInt();
					input.nextLine();
					
					myBookStore.sell(ISBN, numberOfCopies);
					
					System.out.println("Do you want to order more books?(Press 0 to exit; 1 to continue):");
					int reply = input.nextInt();
					input.nextLine();
					if(reply == 0) {
						break;
					}
				}
			}
			
			else if(choice==0) {
				break;
			}
		}
		
	}
}
