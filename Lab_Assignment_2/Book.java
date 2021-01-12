package lab_assignment_2;

public class Book {
	
	public String bookTitle,author, ISBN;
	public int numOfCopies;
	
	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Title: "+bookTitle);
		System.out.println("Author: "+author);
		System.out.println("ISBN: "+ISBN);
		System.out.println("Quantity: "+numOfCopies);
		System.out.println();
	}
}
