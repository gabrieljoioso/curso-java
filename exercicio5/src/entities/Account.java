package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	
	
	//Constructors with arguments for deposit or not.
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // Calls the deposit operation passing the value as an argument.
	}
	
	
	public int getNumber() {
		return number;
	}

	// Account number cannot be changed, so I deleted the setNumber method.

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	// Account balance can only be changed by deposit or withdrawal. I deleted the setBalance method
	
	public void deposit (double amount) {
		balance += amount; // deposit
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0; // withdraw
	}
	
	
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
	

}
