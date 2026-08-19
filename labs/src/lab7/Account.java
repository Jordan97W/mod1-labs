package lab7;

public class Account {

	private int id;
	private String owner;
	private double balance;

	// Constructor
	public Account(int id, String owner, double balance) {

		this.id = id;
		this.owner = owner;
		this.balance = balance;

	}

	// Deposit money
	public void deposit(double amount) {
		//	check if deposit amount is negative
		if (amount < 0) {

			System.out.println("You cannot deposit a negative amount.");

		} else {
			// satisfied so deposit
			this.balance = this.balance + amount;
			System.out.println("Deposited: £" + amount);
		}
	}

	// Withdraw money
	public void withdraw(double amount) {
		// check is withdrawal amount is negative
		if (amount < 0) {

			System.out.println("You cannot withdraw a negative amount.");
			// check if enough money in account to withdraw
		} else if (amount > balance) {

			System.out.println("You do not have enough money in your account.");

		} else {
			// satisfied then make withdrawal
			this.balance = this.balance - amount;
			System.out.println("Withdrawn: £" + amount);

		}
	}

	// Return account details
	public String getDetails() {

		return "ID: " + this.id + "\nOwner: " + this.owner + "\nBalance: £" + this.balance;

	}
	//add interest method
	public void addInterest() {
		double interestRate = 0.025;
		double interest = this.balance * interestRate;
		this.balance = this.balance + interest;
	}

	// Get the account owner's name
	public String getOwner() {
		return this.owner;
	}
}
