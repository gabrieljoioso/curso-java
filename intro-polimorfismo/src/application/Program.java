/* Polimorfismo --> Muitas formas. --> Neste exemplo, uma mesma operação em variaveis do 
mesmo tipo com comportamentos diferentes conforme o apontamento dos objetos. */

package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		// Instanciando duas contas, cada uma com 1000.0 de saldo sendo X conta comum e Y conta poupança.
		Account x = new Account(1020, "Alex", 1000.0); // Metodo withdraw em Account desconta a taxa de 5.00.
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); // Metodo withdraw em SavingsAccount não desconta a taxa de 5.00. 
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}
