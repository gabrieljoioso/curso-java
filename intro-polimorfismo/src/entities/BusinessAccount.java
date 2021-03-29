// linha 33 --> exemplo de super.

package entities;

public class BusinessAccount extends Account {
	private double loanLimit;
	
	public BusinessAccount() {
		super();		// repetir alguma logica implementada na super classe com o construtor padrão.
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance); // Super chama o construtor da super classe com os argumentos. Construtor com os argumentos da classe Account.
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override 
	public void withdraw(double amount) { 
		super.withdraw(amount);				//usando super para realizar o metodo/lógica da superclasse Account e em seguida descontar 2.00.
		balance -= 2.0;
	}


	
	
	
	

}
