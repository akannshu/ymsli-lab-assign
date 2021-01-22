package lab_assignment_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTestDrive {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Rahul", "404", "238/3", 700000);
		
		try {
			FileOutputStream dataFile = new FileOutputStream("C:\\Users\\ve00ym232\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\ymsli\\bin\\lab_assignment_4\\saveData.ser");
			ObjectOutputStream objData = new ObjectOutputStream(dataFile);
			
			objData.writeObject(emp1);
			
			objData.close();
			dataFile.close();
			
			System.out.println("Serialization Done!!!");
			
		} catch(IOException ex) {
			System.out.println("IO Exception Caught");
		}
		
		Employee emp2 = null;
		
		try {
			
			FileInputStream dataFile = new FileInputStream("C:\\Users\\ve00ym232\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\ymsli\\bin\\lab_assignment_4\\saveData.ser");
			ObjectInputStream objData = new ObjectInputStream(dataFile);
			
			emp2 = (Employee) objData.readObject();
			
			dataFile.close();
			objData.close();
			
			System.out.println("Deserailizarion Done!!!");
			emp2.display();
			
		} catch (IOException ex) {
			
			System.out.println("IO Exception Caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("Class not found Exception Caught");
		}
		
		
	}
}
