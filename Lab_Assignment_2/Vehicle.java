package lab_assignment_2;

public class Vehicle {
	
	int noOfWheel;
	int noOFPAssenger;
	int model;
	String make;
	
	public void display() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("No. of Wheel: "+noOfWheel);
		System.out.println("No. of seats: "+noOFPAssenger);
	}
}
