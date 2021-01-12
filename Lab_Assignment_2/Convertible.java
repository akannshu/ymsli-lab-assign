package lab_assignment_2;

public class Convertible extends Car{
	
	boolean isHoodOpen;
	
	public void display() {
		super.display();
		System.out.println("Is hood of car open?: "+isHoodOpen);
	}

}
