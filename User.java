package Task2;

public class User {

	private double balance;
	public User(double intialbalance) {
		if(intialbalance>=0) {
			this.balance = intialbalance;
		}else {
			this.balance=0;
		}	
	}
	public String deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			return "Deposited: $%.2f ,"+amount;
		}
		else {
			return "Invalid deposit amount";
		}
	}

	public String withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			return "WithdrawL $%.2f ,"+amount;
		}
		else if(amount>balance) {
			return "Insufficient balance for this withdrawal.";
		}
		else {
			return "Invalid withdrawal amount.";
		}
	}
	public String checkBalance() {
		return "Your balance is :$%.2f ,"+balance;
	}
}
