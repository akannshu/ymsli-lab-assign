package lab_assignment_3;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		SalariedEmployee s1 = new SalariedEmployee("Rahul", 434);
		s1.setSalaryRate(10000);
		s1.getSalary();
		
		HourlyEmployee he1 = new HourlyEmployee("Raj", 343, 60);
		he1.setSalaryRate(55);
		he1.getSalary();
		
		CommissionEmployee ce1 = new CommissionEmployee("Raj", 343, 150000);
		ce1.setSalaryRate(15);
		ce1.getSalary();


	}

}
