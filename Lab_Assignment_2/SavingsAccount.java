package lab_assignment_2;

public class SavingsAccount extends Account{
	
	double interest;
	double maxWithdrawAmount;
	
	public SavingsAccount(String name) {
		super(name);
		interest = 5;
		maxWithdrawAmount = 99999.9999;
		System.out.println("-----------------Savings Account MENU----------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Get Balance");
		System.out.println("0. Exit");
	}

	public double getBalance() {
		
		double totalInterest = accountBalance * (5/100);
		return accountBalance + totalInterest;
	}

	public void withdraw(double amount) {
		if(amount<maxWithdrawAmount && (accountBalance-amount>2000)) {
			accountBalance-=amount;
		}
		else {
			System.out.println("Cannot withdraw this amount...");
		}
	}
	
}
