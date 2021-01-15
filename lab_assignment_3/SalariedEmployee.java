package lab_assignment_3;

public class SalariedEmployee extends Employee {
	double weekSalary;
	
	public SalariedEmployee(String empName, int empId){
		super(empName, empId);
	}
	
	@Override
	public void setSalaryRate(double salaryRate) {
		this.weekSalary = salaryRate;
	}
	
	@Override
	public void getSalary() {
		System.out.println("Your Weekly Salary is: "+weekSalary);
	}
}
