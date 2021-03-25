package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; //protected pode ser acessado pela classe, classe em outro pacote e sub classe(independente do pacote).
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount; 
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
}
