package entities;

public final class SavingsAccount extends Account { // final --> Evita que subclasses sejam criadas. N�o pode ser herdada.
												   // Atributos de tipo de uma classe final s�o analisados de forma mais rapida em tempo de execu��o.
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

	@Override 
	public final void withdraw(double amount) { // final --> evita que o metodo seja sobreposto em uma subclasse.
		balance -= amount;					   // Boas praticas colocar final nas sobreposi��es afim de evitar inconsistencias.
	}
	
}
