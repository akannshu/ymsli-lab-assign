package lab_assignment_3;

public class CommissionEmployee extends Employee {
	
	double percentShare;
	double totalSales, weekSalary;

	public CommissionEmployee(String empName, int empID, double totalSales) {
		super(empName, empID);
		this.totalSales = totalSales;
		
	}
	
	@Override
	public void setSalaryRate(double salaryRate) {
		this.percentShare = salaryRate;
	}
	

	@Override
	public void getSalary() {
		
		weekSalary = (percentShare*totalSales)/100;
		System.out.println("Your Weekly Salary is: "+weekSalary);
	}

}
