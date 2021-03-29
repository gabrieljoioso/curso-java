package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override //Override avisa o dev e o compilador que esse metodo � uma sobreposi��o.
	public void withdraw(double amount) { //Sopreposi��o da superclasse Account, para que um saque da SavingsAccount n�o cobre taxa de 5.00.
		balance -= amount;
	}
	
}
