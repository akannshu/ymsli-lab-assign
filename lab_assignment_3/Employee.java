package lab_assignment_3;

public abstract class Employee {
	
	String empName;
	int empID;
	
	public Employee(String empName, int empID) {
		this.empName = empName;
		this.empID = empID;
	}
	
	public abstract void getSalary();
	public abstract void setSalaryRate(double salaryRate);
	
	
}
