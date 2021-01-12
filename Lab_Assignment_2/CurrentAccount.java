package lab_assignment_2;

public class CurrentAccount extends Account{
	
	int tradeLicenseNum;
	double maxWithdrawAmount;

	public CurrentAccount(String name) {
		super(name);
		maxWithdrawAmount = 99999.9999;
		System.out.println("-----------------Current Account MENU----------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Get Balance");
		System.out.println("0. Exit");
	}
	
	public double getBalance() {
		return accountBalance;
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
