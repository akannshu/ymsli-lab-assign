package lab_assignment_2;

public class Account {
	public String memberName;
	public long accountNumber;
	public double accountBalance;
	
	public Account(String name) {
		memberName = name;
		int num = 10000 + (int)(Math.random()*89999);
		accountNumber = num;
		accountBalance = 0;
	}
	
	public void deposit(double amount) {
		accountBalance = amount;
	}
}
