package lab_assignment_2;

import java.util.Scanner;

public class BookStore {
	
	Book[] books = new Book[10];
	private int index=0;
	
	public void sell(String ISBN, int noOfCopies) {
		
		boolean flag=false;
		for(int book=0; book<index; book++) {
			if(books[book].ISBN.equals(ISBN)) {
				books[book].numOfCopies-=noOfCopies;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Book Not Found...");
		}
	}
	
	public void order(String ISBN, int numOfCopies) {
		
		boolean flag=false;
		
		if(index>0) {
			for(int book=0; book<index; book++) {
				if(books[book].ISBN.equals(ISBN)) {
					books[book].numOfCopies+=numOfCopies;
					flag = true;
					break;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("This is a new Order...");
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter Name of the Book: ");
			String bookName = input.nextLine();
			
			System.out.print("Enter Name of the Author: ");
			String author = input.nextLine();
			
			books[index] = new Book(bookName,author, ISBN, numOfCopies);
			++index;
		}
	}
	
	public void display() {
		for(int book=0; book<index; book++) {
			books[book].display();
		}
	}
} 
