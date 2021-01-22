package lab_assignment_4;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String empName, empId;
	private transient double empSal;
	Address address = null;
	
	public Employee(String empName, String empId, String address, double empSal) {
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.address = new Address(address);
	}
	
	public void display() {
		System.out.println(empName + " " + empId + " "+empSal+" "+address.getAddress());
	}
}
