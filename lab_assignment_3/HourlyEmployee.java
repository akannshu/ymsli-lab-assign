package lab_assignment_3;

public class HourlyEmployee extends Employee {
	
	private int hoursWorked;
	private double hourlyRate, weekSalary;

	public HourlyEmployee(String empName, int empId, int hoursWorked){
		super(empName, empId);
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public void setSalaryRate(double salaryRate) {
		this.hourlyRate = salaryRate;
	}
	
	@Override
	public void getSalary() {
		
		weekSalary = hourlyRate * hoursWorked;
		System.out.println("Your Weekly Salary is: "+weekSalary);
	}
}
