package lab_assignment_2;

public class CircleTestDrive {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		
		System.out.println("-----------------");
		
		Circle c2 = new Circle(5);
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
		
	}
}


